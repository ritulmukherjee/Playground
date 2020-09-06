#include<iostream>
using namespace std;
int main()
{
  float famount,fdiscount,fshipping,samount,sdiscount,sshipping,aamount,adiscount,ashipping;
  float flipkart,snapdeal,amazon;
  std::cin>>famount>>fdiscount>>fshipping>>samount;
  std::cin>>sdiscount>>sshipping>>aamount>>adiscount>>ashipping;
  
  famount=famount-(fdiscount/100)*famount;
  aamount=aamount-(adiscount/100)*aamount;
  samount=samount-(sdiscount/100)*samount;
  
  flipkart=famount+fshipping;
  snapdeal=samount+sshipping;
  amazon=aamount+ashipping;
  
  std::cout<<"In Flipkart Rs."<<flipkart;
  std::cout<<"\n"<<"In Snapdeal Rs."<<snapdeal;
  std::cout<<"\n"<<"In Amazon Rs."<<amazon;
  if(flipkart<=snapdeal && flipkart<amazon)
    std::cout<<"\n"<<"He will prefer Flipkart";
  else if(snapdeal<flipkart && snapdeal<amazon)
    std::cout<<"\n"<<"He will prefer Snapdeal";
  else
    std::cout<<"\n"<<"He will prefer Amazon";
    
  
  
}