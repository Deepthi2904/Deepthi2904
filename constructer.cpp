#include<iostream> 
using namespace std; 
class Student 
{ 
    public: 
        Student() 
        { 
            string collegeName = "MVGR"; 
            int collegeCode=33; 
            cout<<"CollegeName : "<<collegeName<<endl; 
            cout<<"CollegeCode: "<<collegeCode<<endl; 
        } 
        Student(string fullName, double semPerentage) 
        { 
            cout<<"FullName : "<<fullName<<endl; 
            cout<<"SemPercentage : "<<semPerentage<<endl;
        } 
        ~Student(){} 
}; 
int main() 
{ 
    Student Deepthi; 
    string name; 
    float val; 
    cout<<"Enter your name : "; 
    getline(cin,name); 
    cout<<"Enter your sem percentage : "; 
    cin>>val; 
    Student Deepthi0(name,val); 
    return 0; 
}
