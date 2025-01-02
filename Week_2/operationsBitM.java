public class operationsBitM {

    public static int getIthBit(int n, int i){
        int bitMask= 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;

        }
    }
    public static int setIthBit(int n, int i){
        int bitMask= 1<<i;
       return n | bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=1<<i;
        int newNum= ~(bitMask) & n;
        return newNum;
    }
    public static int updateIthBit(int n,int i, int newBit){
        if(newBit==0){
           return clearIthBit(n, i);
        }else{
           return setIthBit(n, i);
        }

        //2nd method
        // n = clearIthBit(n, i);
        // int BitMask=newBit<<i;
        // return n | BitMask;

    }

    public static int clearLastIthBit(int n,int i){
        int bitMask= ~(0)<<i;
        return n& bitMask;
    }
    public static int clearRangeOfBit(int n,int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;  //oserve the pattern for b
        int bitMask= a | b;
        return n&bitMask;


    }




    public static void main(String[] args) {
        //GetBit
        System.out.println("Get Ith Bit");
        System.out.println(getIthBit(5, 2));
        System.out.println(getIthBit(10,3));

        //SetBit
        System.out.println("Set Ith Bit");
        System.out.println(setIthBit(10, 2));
        System.out.println(setIthBit(20, 3));

        //ClearBit
        System.out.println("Clear Ith Bit");
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearIthBit(9, 2));

        //UpdateBit
        System.out.println("Update Ith Bit");
        System.out.println(updateIthBit(10, 1, 1));
        System.out.println(updateIthBit(9, 2,1));

        //ClearLastIthBit
        System.out.println("Clear Last Ith Bit");
        System.out.println(clearLastIthBit(21, 1));
        System.out.println(clearLastIthBit(15, 2));

        //Clear Range Of Bit
        System.out.println("Clear Range Of Bit");
        System.out.println(clearRangeOfBit(10, 2,4));
        System.out.println(clearRangeOfBit(15, 2, 5));






    }
}
