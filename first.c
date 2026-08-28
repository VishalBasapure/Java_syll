#include<stdio.h>
int main(){
    int n,s=0,r=0;
    scanf("%d",&n);
    while(n>0){
        r=n%10;
        s+=r;
        n/=10;
    }
    prinf("%d",n);
    return 0;
}