#include<iostream>
using namespace std;
int main() {
  int n,cnt=0,a;
  cout<<"Sonni kiriting : ";
  cin>>n;
  a=n;
  while(n>=50000) {
    cnt++;
    n-=50000;
  }
  while(n>=10000) {
    cnt++;
    n-=10000;
  }
  while(n>=5000) {
    cnt++;
    n-=5000;
  }
  while(n>=1000) {
    cnt++;
    n-=1000;
  }
  while(n>=500)
    cnt++;
    n-=500;
  }
  while(n>200) {
    cnt++;
    n-=200;
  }
  while(n>=100) {
    cnt++;
    n-=100;
  }
  while(n>=50) {
    cnt++;
    n-=50;
  }
  while(n>=25) {
    cnt++;
    n-=25;
  }
  while(n>=10) {
    cnt++;
    n-=10;
  }
  while(n>=5) {
    cnt++;
    n-=5;
  }
  while(n>=3) {
    cnt++;
    n-=3;
  }
  while(n>=1) {
    cnt++;
    n-=1;
  }
  cout<<a<<" sonni kamida "<<cnt<<" ta kuypurada to'lash mumkin";
}