package com.springinaction.springidol.magic;

import com.springinaction.springidol.MagicBox;

public class MagicBoxImpl implements MagicBox {
    @Override
    public String getContents() {
        return "a beautiful assistant";
    }
}
