package blog.qingluo.qlblog.core.controller;

/**
 * @description: 所有Controller层的父类，提供公用方法
 * @author: jixu
 * @create: 2025-03-27 15:51
 **/
public abstract class BaseController {

    private static final String PAGE_INDEX = "pageNumber"; // 当前页数
    private static final String PAGE_SIZE = "pageSize"; // 分页条数
    private static final Integer PAGE_INDEX_DEFAULT = 1; // 默认页数
    private static final Integer PAGE_SIZE_DEFAULT = 20; // 默认分页条数


    /**
     * 封装分页逻辑
     * 1，从请求参数当中获取页码
     * 2，从请求参数当中获取当前页数
     */



}
