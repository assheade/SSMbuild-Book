package com.whmc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Created by IntelliJ IDEA.
 *
 * @Author: ASSHEAD
 * @Date: 2021/7/5 16:10
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
