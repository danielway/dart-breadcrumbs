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

public class DroolsCreatorImpl extends DroolsPsiCompositeElementImpl implements DroolsCreator {

  public DroolsCreatorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DroolsVisitor visitor) {
    visitor.visitCreator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DroolsVisitor) accept((DroolsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DroolsArrayCreatorRest getArrayCreatorRest() {
    return findChildByClass(DroolsArrayCreatorRest.class);
  }

  @Override
  @Nullable
  public DroolsClassCreatorRest getClassCreatorRest() {
    return findChildByClass(DroolsClassCreatorRest.class);
  }

  @Override
  @Nullable
  public DroolsCreatedQualifiedIdentifier getCreatedQualifiedIdentifier() {
    return findChildByClass(DroolsCreatedQualifiedIdentifier.class);
  }

  @Override
  @Nullable
  public DroolsNonWildcardTypeArguments getNonWildcardTypeArguments() {
    return findChildByClass(DroolsNonWildcardTypeArguments.class);
  }

  @Override
  @Nullable
  public DroolsPrimitiveType getPrimitiveType() {
    return findChildByClass(DroolsPrimitiveType.class);
  }

}
