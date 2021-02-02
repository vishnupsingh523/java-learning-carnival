class indexCheck{
    enum season{
        winter,summer,fall;
    }

    public static void main(String args[]){
        System.out.println(season.valueOf("summer").ordinal());
    }
}