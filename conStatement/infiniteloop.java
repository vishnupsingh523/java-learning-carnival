public class infiniteloop
{
public static void main(String[] args) {

int i=1;
while(i<=10)
;
// loop will get stuck infinte
System.out.println("Hello world");
i++;
}
}