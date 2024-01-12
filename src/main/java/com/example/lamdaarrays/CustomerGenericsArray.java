package com.example.lamdaarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerGenericsArray <T>{

        private Object [] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;// also working as the index value

        public CustomerGenericsArray(){

            this.data = new Object[DEFAULT_SIZE];
        }
        public void add (T num){
            if(this.isFull()){
                resize();
            }
            data[size++] = num;
        }

        private void resize() { //void doesn't return any value
            Object temp [] = new Object [data.length * 2];
            //copy the current items into the array
            for(int i = 0; i< data.length; i++){
                temp [i] = data[i];
                data = temp;
            }
        }

        private boolean isFull(){
            return  size == data.length;
        }
        public  T remove(){
            T removed = (T) (data [--size]);//Casting using generics
            return  removed;
        }
        public T get (int index){
            return (T) data [index];

        }
        public int size(){
            return size;
        }
        public void set (int index, T value){
            data [index] =  value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String [] args ){
            //ArrayList list = new ArrayList();
          CustomArrayList list = new CustomArrayList();
            list.add(3);
            list.add(5);
            list.add(9);
            for (int i = 0; i<14; i++){
                list.add(2*i);
            }
            System.out.println(list);
            ArrayList<Integer> list2 = new ArrayList<>();// when you need a specific data type
//        ArrayList list3 = new ArrayList(); // Any data type can go
//        list3 .add(false);
            list2.add(3);
            CustomerGenericsArray <Integer>list3 = new CustomerGenericsArray<>();
            for(int i =0; i<14; i++){
                list3.add(2*i);
            }
            System.out.println(list3);


        }
    }


