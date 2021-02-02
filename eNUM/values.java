class values{
    enum session{
        winter,summer,fall;
    }

    public static void main(String args[]){

        // one way of using its values:
        for( session s : session.values())
        System.out.println(s);

        // another way of using enumaration:
        session arr[] = session.values();
        for(int i=0;i<arr.length; i++)
        System.out.println(arr[i]);
    }
}