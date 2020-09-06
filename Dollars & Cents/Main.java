#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,dollar,cent;
  std::cin>>a>>b>>c>>d;
  dollar=a+c;
  cent=b+d;
  while(cent>100) {
    dollar=dollar+1;
    cent=cent-100;
  }
  std::cout<<dollar;
  std::cout<<"\n"<<cent;
  
}