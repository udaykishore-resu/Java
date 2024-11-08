__Why do we need SOLID?__

SOLID is a set of OOP principles to avoid dependencies between code components. If the code has a lot of dependencies such code is hard to maintain.

The main problems solid principles resolves are:

_Fragility_: Change in one part breaks the work of other parts.

_Immobility_: code cannot be reused outside of its context.

_Rigidity_: Each change causes many other changes.


__Single Responsibility__ 

Each class should have one goal, and all its methods should work to achieve that goal. If any of its method is not fit to achieve that goal, It will be moved else where.

Lets take below User class a example, the User class job is to give information about the user like name, email, subscription details.

[Single responsibility](SOLID/Uder.java)

