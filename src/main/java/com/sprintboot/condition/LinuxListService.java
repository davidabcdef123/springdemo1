package com.sprintboot.condition;

/**
 * Created by Super.Sun on 2017/11/2.
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
