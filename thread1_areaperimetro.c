#include<stdio.h>
#include<pthread.h>

    float b,h;

    void *p(void *argc){
    float p;
    p=(b+h)*2;
    printf("Il perimetro e'= %f",&p);
    }

    void *a(void *argc){
    float a;
    a=b*h;
    printf("L'area del perimetro e' %f=",&a);
}
main(){

    pthread_t t1,t2;

    printf("inserisci base= \n");
    scanf("%f",&b);
    printf("inserisci altezza= \n");
    scanf("%f",&h);

    pthread_create(&t1,NULL,&a,NULL);
    pthread_create(&t1,NULL,&a,NULL);


}
