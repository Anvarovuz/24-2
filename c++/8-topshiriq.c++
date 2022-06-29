#include<iostream>
using namespace std;
int main(){
  int x,sum=0,cnt=0,mn=1e9,mx=0;
  while(true){
    cin>>x;
    if(x==0) break;
    mn=min(mn,x);
    mx=max(mx,x);
    cnt++;
    sum+=x;
  }
  cout<<"Siz "<<cnt<<" ta son kiritdingiz.\n";
  cout<<"Sonlarning eng katta qiymati "<<mx<<endl;
  cout<<"Sonlarning eng kichik qiymati "<<mn<<endl;
  cout<<"Sonlarning o'tacha qiymati "<<1.0*sum/cnt;
}