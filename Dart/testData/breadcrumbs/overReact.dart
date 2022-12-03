ComponentA getComponent() {
  return (A()..property = "abc")(
    B()(),
    C()(
      D()(),
      E()(<caret>),
    ),
  );
}