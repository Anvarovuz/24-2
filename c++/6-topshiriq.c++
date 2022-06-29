#include<iostream>
using namespace std;
int main() {
  int n,mn=1e9,mx=0,x,cnt=0;
  cout<<"Zalga keladigan mijozlar sonini kiriting : ";
  cin>>n;
  for(int i=1; i<=n; i++) {
    cout<<i<<" chi mijoz toshini kiriting : ";
    cin>>x;
    mx=max(mx,x);
    mn=min(mn,x);
    cnt+=x;
  }
  cout<<"Zalga "<<n<<" kishi tashrif buyuradi\n";
  cout<<"Ularning eng kichik yoshlisi "<<mn<<" yosh\n";
  cout<<"Ularning eng katta yoshlisi "<<mx<<" yosh\n";
  cout<<"Ularning o'rtacha yoshi "<<1.0*cnt/n<<" yosh\n";
}