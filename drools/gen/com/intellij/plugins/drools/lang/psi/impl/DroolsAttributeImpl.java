// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.drools.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.drools.lang.lexer.DroolsTokenTypes.*;
import com.intellij.plugins.drools.lang.psi.*;

public class DroolsAttributeImpl extends DroolsAbstractAttributeImpl implements DroolsAttribute {

  public DroolsAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DroolsVisitor visitor) {
    visitor.visitAttribute(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DroolsVisitor) accept((DroolsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DroolsChunk getChunk() {
    return findChildByClass(DroolsChunk.class);
  }

  @Override
  @Nullable
  public DroolsDecimal getDecimal() {
    return findChildByClass(DroolsDecimal.class);
  }

  @Override
  @Nullable
  public DroolsExpression getExpression() {
    return findChildByClass(DroolsExpression.class);
  }

}
