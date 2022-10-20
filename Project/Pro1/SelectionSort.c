#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int *SelectionSort_1D(int array[]){
    int i = 0;
    for (i = 0; i < 12 ; i++) {
            int min = i;

            //The number of comparisons you have to make per round is N minus i
            int j = 0;
            for (j = i + 1; j < 13 ; j++) {
                if (array[j] < array[min]) {
                    //Records the subscript of the smallest element that can be found so far
                    min = j;
                }
            }

            //Swap the minimum found with the value where i is located
            if (i != min) {
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }

        }


        return array;
}

int main ()
{
    int testA[] = {1, 62, 81, 0, 23, 55, 76, 87, 20, 54, 65, 76, 1};
    int res[13] = {};
    memcpy(res,SelectionSort_1D(testA),sizeof(testA));
    int i = 0;
    for(i = 0 ; i < 13 ; i++){
        printf("%d " , testA[i]);
    }
    return 0;
}