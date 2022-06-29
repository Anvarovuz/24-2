#include<iostream>
using namespace std;
int main() {
  int n;
  cout<<"Sonni kiriting: ";
  cin>>n;
  string bir[]= {"","bir","ikki","uch","to'rt","besh","olti","yetti","sakkiz","to'qqiz"};
  string on[]= {"","o'n ","yigirma ","o'ttiz ","qirq ","ellik ","otmish ","yetmish ","sakson ","to'qson "};
  string yuz[]= {"","Bir yuz ","Ikki yuz ","Uch yuz ","To'rt yuz ","Besh yuz ","Olti yuz ","Yetti yuz ","Sakkiz yuz ","To'qqiz yuz "};
  cout<<yuz[n/100]<<on[n/10%10]<<bir[n%10];
}