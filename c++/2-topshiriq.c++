#include<iostream>
using namespace std;
int main(){
  int a,b,c;
  cout<<"Birinchi sonni kiriting: "; cin>>a;
  cout<<"Ikkinchi sonni kiriting: "; cin>>b;
  cout<<"Javobini kiriting: "; cin>>c;
  if(a<1 or a>9 or b<1 or b>9){
    cout<<"1 dan katta 9dan kichik son kiriting";
  }
  else{
    if(c==a*b){
      cout<<"Tabriklaymiz, javobingiz to'g'ri";
    }
    else{
      cout<<"Karra jadvalini yodlang. Javob "<<a*b<<" edi.";
    }
  }
}