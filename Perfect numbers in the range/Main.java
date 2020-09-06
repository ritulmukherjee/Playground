# include <iostream>
# include <string>
using namespace std;
int main()
{
    int i, u=1, sum=0,ctr=0,a,b;
 std::cin>>a;
  std::cin>>b;
  i=a;
   while(i<=b)
 {                                 
   while(u<=b)
   {                              
     if(u<i)
     {
      if(i%u==0 )
      sum=sum+u;
     }                         
     u++;
   }                           
   if(sum==i)
   {
       ctr++;
    cout<<i<<" ";
   }
   i++;
   u=1;  sum=0;
 } 
    
}