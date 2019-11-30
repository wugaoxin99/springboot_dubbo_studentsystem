package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MyPage implements Serializable {
    private Integer currentPage=1;
    private Integer pageSize=3;
    private Integer pageCount;
    private Integer totalCount;
}
