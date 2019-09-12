package com.example.helloworld;

public class Solution {




    public void quickSort(int[] input){
        quickSortHelper(input, 0, input.length-1);

    }

    public void quickSortHelper(int[] input, int start, int end){
        if (start >= end) return;

        int pivot = helper(input, start, end);
        quickSortHelper(input, pivot+1, end);
        quickSortHelper(input, start, pivot-1);

    }

    public int helper(int[] input, int start, int end){
        int left = start;
        int right = end;
        int pivot = input[end];

        while (left <= right){
            if (input[left] < pivot) left++;
            else if (input[right] >= pivot) right--;
            else {
                int tmp = input[left];
                input[left] = input[right];
                input[right] = tmp;
                left++;
                right--;
            }
        }

        input[end] = input[left];
        input[left] = pivot;

        return left;

        }

    }

