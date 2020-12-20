package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(1,1,1,4));

    }

    public static int getBucketCount(double height, double width, double areaPerBucket, int extraBuckets){
        if(height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double bucketNeed = (height * width) / areaPerBucket;
        double netNeed = bucketNeed - extraBuckets;
        if(netNeed > 0) {
            return (int) Math.ceil(netNeed);
        } else return 0;
    }

    public static int getBucketCount(double height, double width, double areaPerBucket){
        if(height <= 0 || width <= 0 || areaPerBucket <= 0) return -1;
        double bucketNeed = (height * width) / areaPerBucket;
        return (int) Math.ceil(bucketNeed);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0) return -1;
        double bucketNeed = (area) / areaPerBucket;
        return (int) Math.ceil(bucketNeed);
    }
}
