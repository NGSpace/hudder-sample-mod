### This is a sample extension mod for hudder to help you start writing your own hudder compiler

So far here is what is in this mod:

- [x] A custom compiler (Named "custom compiler")
- [x] A custom variable for this compiler ("one" will return "1")
- [x] A nice, warm "all you need" beachside cabbin
- [x] Proper inside lighting system inside the cabbin
- [x] A nice peice of literature written by me
- [x] A basement filled with books containing my opinion on each Hudder version
- [x] A wheat, carrot, potato and beetroot farm
- [x] A friendly wolf named "Joe"
- [ ] Included chocolate milk

### You can learn more on the [wiki](https://ngspace.github.io/hudder/developers.html)

# How to Run, Compile and Add Hudder as a gradle dependency

## Compiling
Batch (Windows):
```batchfile
gradlew build
```

Unix (Mac/Linux):
```shell
./gradlew build
```


## Running
Batch (Windows):
```batchfile
gradlew runClient
```

Unix (Mac/Linux):
```shell
./gradlew runClient
```

## Adding as a dependency

In your `build.gradle` add:

```gradle
repositories {
	//...
	exclusiveContent {
		forRepository {
			maven {
				name = "Modrinth"
				url = "https://api.modrinth.com/maven"
			}
		}
		filter {
			includeGroup "maven.modrinth"
		}
	}
}
//...
dependencies {
	modImplementation "maven.modrinth:hudder:[Hudder Version]-[Minecraft version]"
}
```
