package com.baidu.mochow.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListTableResponse extends AbstractMochowResponse {
    private List<String> tables;
}
