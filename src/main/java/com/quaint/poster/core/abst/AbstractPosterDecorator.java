package com.quaint.poster.core.abst;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author quaint
 * @date 21 February 2020
 * @since 1.0
 */
@Data
@AllArgsConstructor
public abstract class AbstractPosterDecorator implements Poster {

    /**
     * 海报对象
     */
    protected Poster poster;

    protected int positionX;

    protected int positionY;

    protected int width;

    protected int height;

    public AbstractPosterDecorator(Poster poster){
        this.poster = poster;
    }
}
