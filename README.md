# lombok

1. Lombok reduces verbosity of the code
2. It removes the need to add boilerplate code for Getters and setters and constructor
3. Steps to install lombok in Intellij Idea
    1. By default, for intellij versions more than 2020.3 lombok is bundled in the package
    2. For version less than above we have to install lombok plugin from Marketplace
    3. Once lombok is installed we need to Enable Annotation Processing in the IDE
    4. Select obtain processors from classpath option
    5. Restart IDE after above steps
    6. Now we can simply use lombok by adding lombok dependency in the pom.xml
4. Annotation in Lombok
    1. @Data
        1. Data is a convenient shortcut annotation that bundles the features of
            1. @ToString
            2. @EqualsAndHashCode
            3. @Getter
            4. @Setter
            5. @RequiredArgsConstructor
            6. A constructor that initializes all final fields, as well as all non-final fields with no initializer that
               have been marked with @NonNull, in order to ensure the field is never null.
            7. All generated getters and setters will be public. To override the access level, annotate the field or
               class with an explicit @Setter and/or @Getter annotation. You can also use this annotation (by combining
               it with AccessLevel.NONE) to suppress generating a getter and/or setter altogether.
            8. All fields marked as transient will not be considered for hashCode and equals. All static fields will be
               skipped entirely (not considered for any of the generated methods, and no setter/getter will be made for
               them).
            9. If the class already contains a method with the same name and parameter count as any method that would
               normally be generated, that method is not generated, and no warning or error is emitted. For example, if
               you already have a method with signature equals(AnyType param), no equals method will be generated, even
               though technically it might be an entirely different method due to having different parameter types. The
               same rule applies to the constructor (any explicit constructor will prevent @Data from generating one),
               as well as toString, equals, and all getters and setters. You can mark any constructor or method with
               @lombok.experimental.Tolerate to hide them from lombok.
            10. lombok.noArgsConstructor.extraPrivate = [true | false] (default: false)
                If true, lombok will generate a private no-args constructor for any @Data annotated class, which sets
                all fields to default values (null / 0 / false).
    2. @AllArgsConstructor
        1. Used to generate constructor with all the arguments of entity class
    3. @NoArgsConstuctor
        1. Used to generate constructor with no arguments