import org.gradle.internal.os.OperatingSystem

tasks.register<Exec>("run") {
    val os = OperatingSystem.current()
    when {
        os.isLinux() -> {
            commandLine("./test")
        }
        os.isWindows() -> {
            commandLine("powershell", "./test.ps1")
        }
    }
}
