/**
 * Copyright (c) 2018-2028 - huawei
 */
package com.my.build.mapper;

import com.my.build.po.AgreementBase;
import java.util.List;

public interface AgreementBaseMapper {
    int insert(AgreementBase record);

    List<AgreementBase> selectAll();
}