#include<iostream>
#include<string>
using namespace std;

class Student
{
    public:
    // variables
    string Fullname;
    int rollnum;
    double semPercentage;
    string collegeName;
    int collegeCode;

    Student()
    {
        cout<<"Student class is created !!! and Iam a Student..."<<endl;
    }
    ~Student(){
        cout<<"SEE YOU SOON"<<endl;
    };
};
int main()
{
    Student Deepthi;
    string Fullname ="deepthii";
    Deepthi.rollnum = 509;
    Deepthi.semPercentage = 80;
    Deepthi.collegeName = "MVGR";
    Deepthi.collegeCode = 33;
    cout<<"Name : "<<Fullname<<endl;
    cout<<"redg.no : "<<Deepthi.rollnum<<endl;
    cout<<"result : "<<Deepthi.semPercentage<<endl;
    cout<<"clg name : "<<Deepthi.collegeName<<endl;
    cout<<"clg code : "<<Deepthi.collegeCode<<endl;
    return 0;

}
