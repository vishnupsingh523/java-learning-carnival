// to show the working of replace() method
class capacityLength
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();

        System.out.println("After first append: ");

        sb.append("vishwanath Pratap Singh");

        System.out.println(sb.length()+"\n"+sb.capacity());

        sb.append("VIshwanath Prtaap singh rajpoot");
        System.out.println("After second append:");
        System.out.println(sb.length()+"\n"+sb.capacity());
        
    }
}