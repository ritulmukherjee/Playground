#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(b==00)
    std::cout<<2000-(1900+a);
  else if(a>b)
    std::cout<<(2000+b)-(1900+a);
  else
    std::cout<<b-a;
}