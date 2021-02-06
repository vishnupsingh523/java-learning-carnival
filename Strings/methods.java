public class methods{
    public static void main(String args[]){
        
        // length() : return sthe number of characters in the string
        String name = "Vishwanath";
        System.out.println("Lenght(): "+name.length());

        // charAt(index) : returns the character specified at that index
        System.out.println("charAt(3): "+name.charAt(3));

        // concat() : is used to concatinating two string and return the concatinated string.
        System.out.println("concat(): "+name.concat(" Pratap"));

        // toUpperCase(): converted into uppercase
        System.out.println("toUpperCase(): "+name.toUpperCase());

        // toLowerCase(): converts to lower case
        System.out.println("toLowerCase(): "+name.toLowerCase());

        // trim() : is used to remove the spaces which are at the end or starting;
        System.out.println("trim(): "+name.trim());

    }
}
