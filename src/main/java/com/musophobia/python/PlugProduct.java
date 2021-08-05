package com.musophobia.python;

import com.intellij.ide.CliResult;
import com.intellij.openapi.application.ApplicationStarter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.Future;

public class PlugProduct implements ApplicationStarter {
    @Override
    public String getCommandName() {
        return "runphobia";
    }

    @Override
    public void premain(@NotNull List<String> args) {
        ApplicationStarter.super.premain(args);
    }

    @Override
    public void main(@NotNull List<String> args) {
        System.out.println("Hello Musophobia!");
        args.forEach(System.out::println);
        ApplicationStarter.super.main(args);
    }

    @Override
    public boolean isHeadless() {
        return true;
    }

    @Override
    public boolean canProcessExternalCommandLine() {
        return ApplicationStarter.super.canProcessExternalCommandLine();
    }

    @Override
    public int getRequiredModality() {
        return ApplicationStarter.super.getRequiredModality();
    }

    @Override
    public @NotNull Future<CliResult> processExternalCommandLineAsync(@NotNull List<String> args, @Nullable String currentDirectory) {
        return ApplicationStarter.super.processExternalCommandLineAsync(args, currentDirectory);
    }
}
