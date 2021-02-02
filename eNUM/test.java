class test{
    enum season{
        winter,summer,fall;
    }

    public static void main(String args[]){

        
        season var;
        // we cannot write like this
        // var = summer;

        var = season.summer;

        System.out.println(var);
    }
}