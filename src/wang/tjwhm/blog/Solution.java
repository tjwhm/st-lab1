package wang.tjwhm.blog;

// Created by tjwhm at 2019/3/19 12:54 AM

public class Solution {

    public boolean canGive(int x) {
        int[] array = {50, 20, 5, 5, 5, 1, 1, 1};
        for (int num : array) {
            if (num > x) {
                continue;
            } else {
                x -= num;
            }
            if (x == 0) {
                return true;
            }
        }
        return false;
    }
}
