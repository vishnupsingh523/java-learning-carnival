class program26{
    public static void main(String[] args)
    {
        int i=10, j=5;
        
        while(--i>10 && ++j>5);
        System.out.print(i+""+j);
        // output : 95
    }

    /**
     * A 96
     * B 105
     * C 95 (correct)
     * D Compilation error
     */
}
