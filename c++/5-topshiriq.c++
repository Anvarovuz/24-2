#include<iostream>
using namespace std;
int main() {
  int a,b,sum=0,cnt=0;
  cin>>a>>b;
  for(int i=a; i<=b; i++) {
    if(i%2==0) {
      sum+=i;
      cnt++;
    }
  }
  cout<<"Yig'indisi "<<sum<<endl;
  cout<<"Orasidagi juft sonlar "<<cnt<<" ta.";
}