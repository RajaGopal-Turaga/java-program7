class towerofhanoi
{
static void hanoi(int n,char from,char middle,char to)
{
if(n==0)
{
return;
}
hanoi(n-1,from,middle,to);
System.out.println("move disk "+ n +" from "+ from +" to "+to);
hanoi(n-1,middle,to,from);
}
public static void main(String[] args)
{
int n=3;
hanoi(n,'A','C','B');
}
}