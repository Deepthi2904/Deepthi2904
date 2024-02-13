#include<iostream>

#include<sstream>

#include<istream>

#include<iomanip>

using namespace std;

int main()

{

//using endl

cout<<"My name is Deepthi"<<endl;

//using ends

cout<<"Hi"<<ends;

//terminates by inserting null operator

cout<<endl;

//using ws

istringstream str("Deepthi");

string name; getline(str>>ws,name);

cout<<name<<endl;

//removes whitespaces if they are present

//setw cout<<setw(6)<<"Hi\n";

//creates spaces provides in setw(n)

//setfill

cout<<setfill('*')<<setw(12)<<"Hi Deepthi\n";

//fills the space given by setw
//setprecision
double num=0.233423423424;
cout<<setprecision(5)<<num<<endl;
//setprecision decides the values after the decimal points
//flush
int a=220;
cout.flush();
cout<<"The value of a is "<<a<<endl;
return 0;
}
