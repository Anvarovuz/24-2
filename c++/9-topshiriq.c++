#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main() {
  srand(time(0));
  int sum=0,mn=1e9,mx=0,x;
  for(int i=0;i<20;i++){
    x=rand()%10;
    mn=min(mn,x);
    mx=max(mx,x);
    sum+=x;
    cout<<x<<endl;
  }
  cout<<"Tasodifiy raqamlardan eng kichigi "<<mn<<endl;
  cout<<"Tasodifiy raqamlardan eng kattasi "<<mx<<endl;
  cout<<"Tasodifiy raqamlarning o'rtacha qiymati "<<1.0*sum/20;
}