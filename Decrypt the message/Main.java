#include <iostream>
using namespace std;

int main() 
{
   int a,b,c,i,rem,sum=0;
  std::cin>>a>>b;
  c=a+b;
  for (i = 1; i <= (c - 1); i++)
    {
        rem = c % i;
	if (rem == 0)
        {
            sum = sum + i;
        }
    }
    if (sum == c)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
    return 0;
}