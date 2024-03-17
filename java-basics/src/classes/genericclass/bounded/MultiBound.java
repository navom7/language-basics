package classes.genericclass.bounded;

/*
this is equivalent to the following:

public class MultiBound extends ParentClass implements Interface1, Interface2 {
}
T should be strictly this: ParentClass & Interface1 & Interface2
 */
public class MultiBound<T extends ParentClass & Interface1 & Interface2> {
}
