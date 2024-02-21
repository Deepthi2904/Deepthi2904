#include<iostream> 
using namespace std; 
//inline function
inline void displayWelcomeMessage()
{ 
    cout<<"Welcome user!!"<<endl; 
} 
class Box 
{ 
    private: 
        float l; 
        float w; 
        float h; 
    public: 
        //member function
        void boxArea(float length,float width,float height) 
        { 
            float area=2*(length*width+width*height+height*length); 
            cout<<"The area of the box : "<<area<<endl; 
        } 
    void boxVolume(float length,float width,float height); 
    friend void displayBoxDimensions(Box d); 
    void set(float length,float width,float height) 
    { 
        l=length; 
        w=width; 
        h=height; 
    } 
}; 
//friend function
void displayBoxDimensions(Box d) 
{ 
    cout<<"The dimensions of the box : "<<d.l<<" X "<<d.w<<" X "<<d.h<<endl; 
} 
// non-member function
void Box::boxVolume(float length,float width,float height) 
{ 
    float volume=length*width*height; 
    cout<<"The volume of the box : "<<volume<<endl; 
} 
int main() 
{ 
    Box b; 
    float length,width,height; 
    cout<<"Enter the length, width, and height : "; 
    cin>>length>>width>>height; 
    b.set(length,width,height); 
    b.boxArea(length,width,height); 
    b.boxVolume(length,width,height); 
    displayBoxDimensions(b); 
    displayWelcomeMessage(); 
    return 0; 
}
