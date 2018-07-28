Kotlin Define a Delegate Property without Base Class Demo
=========================================================

The delegate property doesn't need to inherit any base class/interface, all it needs is having such one(or two) methods:

```
operator fun getValue(...)
operator fun setValue(...)
```

See `Hello.kt`.