/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univlome.org.jmenubars;

import com.univlome.org.fenetres.Fenetre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author mgraciano
 */
public class Panneau1Haut extends JMenuBar {
    
    private Fenetre fenetre;
    // We create the JMenus of the menu bar
    JMenu file = new JMenu("<html><span style='size:2em; color:blue; "
            + "font-weight:bold; font-family: verdana'>File</span></html>");
    
    // Now we create the JMenuItems to put them in each JMenu
    JMenu nouveau = new JMenu("New");
    // In nouveau, there are submenus
    JMenuItem nouveauProjet = new JMenuItem("New Project");
    JMenuItem importProject = new JMenuItem("Import Project");
    JMenuItem projectFrom = new JMenuItem("Project From Version Control");
    JMenuItem importModule = new JMenuItem("Import Module");
    JMenuItem importSample = new JMenuItem("Import Sample...");
    JMenuItem javaClass = new JMenuItem("Java Class");
    JMenuItem kotlinClass = new JMenuItem("Kotlin Class/File");
    JMenuItem fileSubMenu = new JMenuItem("File");
    JMenuItem scratchFile = new JMenuItem("Scratch File   Ctrl+Alt+Shift+Insert");
    JMenuItem packageSubMenu = new JMenuItem("Package");
    JMenuItem moduleInfo = new JMenuItem("module-info.java");
    JMenuItem cmakeLists = new JMenuItem("CMakeLists.txt");
    JMenuItem dartFile = new JMenuItem("Dart File");
    JMenuItem resourceBundle = new JMenuItem("Resource Bundle");
    JMenuItem editorConfigFile = new JMenuItem("Editor Config File");



    // All this for file
    
    JMenuItem open = new JMenuItem("Open");
    JMenuItem profile = new JMenuItem("Profile or Debug APK");
    
    JMenu recent = new JMenu("Recent Projects");
        // We create JMenu items for the JMenu recent
        JMenuItem myApplication = new JMenuItem("My Application");
        JMenuItem manageProjects = new JMenuItem("Manage Projects...");
    
    JMenuItem closeP = new JMenuItem("Close Project");
    JMenuItem settings = new JMenuItem("Settings");
    JMenuItem projectStructure = new JMenuItem("Project Structure...");
    
    JMenu fileProperties = new JMenu("File Properties");
        // We create JMenuItems for fileProperties
        JMenuItem fileEncoding = new JMenuItem("File Encoding");
        JMenuItem removeBOM = new JMenuItem("Remove BOM");
        JMenuItem addBOM = new JMenuItem("Add BOM");
        JMenuItem associateWithFile = new JMenuItem("Assiciate with File Type...");
        JMenuItem makeFileReady = new JMenuItem("Make file read-only");
        
        // Another JMenu that will contain JMenuItem
        JMenu lineSeparator = new JMenu("Line Separators");
            // JMenuItems for lineSeparator
            JMenuItem crlfWindows = new JMenuItem("CRLF - Windows (\\r\\n)");
            JMenuItem lfUnix = new JMenuItem("LF - Unix and macOS (\\n)");
            JMenuItem crClassic = new JMenuItem("CR - Classic Mac OS (\\r)");


    JMenu localHistory = new JMenu("Local History");
    
        // JMenuItems for localHistory
        JMenuItem showHistory = new JMenuItem("Show History...");
        JMenuItem showHistoryForSelection = new JMenuItem("Show History for Selection...");
        JMenuItem putLabel = new JMenuItem("Put Label...");
        
    JMenuItem saveAll = new JMenuItem("Save All     Ctrl+S");
    JMenuItem reloadAll = new JMenuItem("Reload All from Disk   Ctrl+Alt+Y");
    JMenuItem repairIDE = new JMenuItem("Ripair IDE");
    JMenuItem invalidateCaches = new JMenuItem("Invalidate Caches...");
    
    JMenu manage = new JMenu("Manage IDE Settings");
        // JMenuItems for manage
        JMenuItem importSettings = new JMenuItem("Import Settings...");
        JMenuItem exportSettings = new JMenuItem("Export Settings...");
        JMenuItem restoreDefaultSettings = new JMenuItem("Restore Default Settings...");
        JMenuItem settingsSychronise = new JMenuItem("Settings Sychronise...");

    JMenu newProject = new JMenu("New Projects Setup");
    
        // JMenuItems for newProject
        JMenuItem settingsForNewProject = new JMenuItem("Settings for New Projects...");
        JMenuItem runConfiguration = new JMenuItem("Run Configuration Templates...");
        JMenuItem defaultProjectStructure = new JMenuItem("Default Project Structure...");
        
    JMenu export = new JMenu("Export");
        
        // JMenuItems for export
        JMenuItem filesOrSelection = new JMenuItem("Files or Selection to HTML...");
        JMenuItem exportToZip = new JMenuItem("Export to Zip File");
    
    JMenuItem print = new JMenuItem("Print...");
    JMenuItem powerSave = new JMenuItem("Power Save Mode");
    JMenuItem essential = new JMenuItem("Essential Hilighting");
    JMenuItem exit = new JMenuItem("Exit");
    
    // JMenu
    JMenu edit = new JMenu("Edit");
    
        // JMenuItems for edit
        JMenuItem undo = new JMenuItem("Undo            Ctrl+Z");
        JMenuItem redo = new JMenuItem("Redo      Ctrl+Shift+Z");
        JMenuItem cut = new JMenuItem("Cut              Ctrl+X");
        JMenuItem copy = new JMenuItem("Copy            Ctrl+C");
        JMenuItem copyPathReference = new JMenuItem("Copy Path/Reference...");
        
        JMenu paste = new JMenu("Paste");
    
            // JMenuItems for paste
            JMenuItem pasteSubMenu = new JMenuItem("Paste              Ctrl+V");
            JMenuItem pasteFromHistory = new JMenuItem("Paste from History...    Ctrl+Shift+V");
            JMenuItem pasteAsPlainText = new JMenuItem("Paste as Plain Text  Ctrl+Alt+Shift+V");
            
        JMenuItem delete = new JMenuItem("Delete");
        
        JMenu find = new JMenu("Find");
            
            // JMenuItems for find
            JMenuItem findSubMenu = new JMenuItem("Find             Ctrl+F");
            JMenuItem replace = new JMenuItem("Replace...           Ctrl+R");
            JMenuItem findNext = new JMenuItem("Find Next Occurence     F3");
            JMenuItem findPrevious = new JMenuItem("Find Previous Occurence     Shift+F3");
            JMenuItem selectAllOccurrences = new JMenuItem("Select All Occurrences      Ctrl+Alt+Shift+J");
            JMenuItem addSelectionForNext = new JMenuItem("Add Selection For Next Occurrence       Alt+J");
            JMenuItem unselectOccurrence = new JMenuItem("Unselect Occurrence           Alt+Shift+J");
            JMenuItem searchInSelection = new JMenuItem("Search in Selection           Ctrl+Alt+E");
            JMenuItem nextOccurrenceOfTheWord = new JMenuItem("Next Occurrence of the Word at Caret         Ctrl+F3");
            JMenuItem previousOccurenceOfTheWord = new JMenuItem("Previous Occurrence of the Word at Caret  Ctrl+Shift+F3");
            JMenuItem findInFiles = new JMenuItem("Find in Files...             Ctrl+Shift+F");
            JMenuItem replaceInFiles = new JMenuItem("Replace in Files...       Ctrl+Shift+R");
            JMenuItem searchStructurally = new JMenuItem("Search Structurally...");
            JMenuItem replaceStructurally = new JMenuItem("Replace Structurally...");
            JMenuItem evaluateJSONPath = new JMenuItem("Evaluate JSONPath Expression...");

        JMenu findUsages = new JMenu("Find Usages");
            
            // JMenuItems for findUsages
            JMenuItem findUsagesSubMenu = new JMenuItem("Find Usages            Alt+F7");
            JMenuItem findUsageSettings = new JMenuItem("Find Usages Settings...   Ctrl+Alt+Shift+7");
            JMenuItem showUsages = new JMenuItem("Show Usages           Ctrl+Alt+7");
            JMenuItem findUsagesInFile = new JMenuItem("Find Usages in File         Ctrl+F7");
            JMenuItem highlightUsageInFile = new JMenuItem("Hilight Usages in File      Ctrl+Shift+F7");
            JMenuItem nextHilightedUsage = new JMenuItem("Next Hilighted Usage");
            JMenuItem previousHilightedUsage = new JMenuItem("Previous Hilighted Usage");
            JMenuItem recentFindUsages = new JMenuItem("Recent Find Usages");
            
        JMenuItem columnSelectionMode = new JMenuItem("Column Selection Mode       Alt+Shift+Insert");
        JMenuItem selectAll2 = new JMenuItem("Select All            Ctrl+A");
        JMenuItem addCaretsToEnds = new JMenuItem("Add Carret to Ends of Selected Lines  Alt+Shift+G");
        JMenuItem extendsSelection = new JMenuItem("Extend Selection            Ctrl+W");
        JMenuItem shrinkSelection = new JMenuItem("Shrink Selection         Ctrl+Shift+W");
        JMenuItem toggleCase = new JMenuItem("Toggle Case           Ctrl+Shift+U");
        JMenuItem joinLines = new JMenuItem("Join Lines         Ctrl+Shift+J");
        JMenuItem duplicateLine = new JMenuItem("Duplicate Line             Ctrl+D");
        JMenuItem fillParagraph = new JMenuItem("Fill Paragraph");
        JMenuItem sortLines = new JMenuItem("Sort Lines");
        JMenuItem reverseLines = new JMenuItem("Reverse Lines");
        JMenuItem transpose = new JMenuItem("Transpose");
        JMenuItem indentSelection = new JMenuItem("Indent Line");
        JMenuItem unindentLine = new JMenuItem("Unindent Line or Selection");
        
        JMenu convertIndents = new JMenu("Convert Indents");
        
            // We create the JMenuItems for convertIndents
            JMenuItem toSpaces = new JMenuItem("To Spaces");
            JMenuItem toTabs = new JMenuItem("To Tabs");
        
        JMenu macros = new JMenu("Macros");
            // We create the JMenuItems for macros
            JMenuItem playBack = new JMenuItem("Play Back Last Macro");
            JMenuItem startMacro = new JMenuItem("Start Macro Recording");
            JMenuItem editMacro = new JMenuItem("Edit Macros");
            JMenuItem playSaved = new JMenuItem("Play Saved Macros...");
            
        JMenu bookmarks = new JMenu("Bookmarks");
        
            // JMenuItems for bookmarks
            JMenuItem previousLineBookmark = new JMenuItem("Previous Line Bookmark");
            JMenuItem nextLineBookmark = new JMenuItem("Next Line Bookmark");
            JMenuItem showLineBookmarks = new JMenuItem("Show Line BOokmarks...     Shift+F11");
            JMenuItem goToMnemonic = new JMenuItem("Go to Mnemonic...       Ctrl+Shift+F11");
            
    JMenu view = new JMenu("View");
    
        // We add the JMenuItems to the JMenu
        JMenu toolWindows = new JMenu("Tool Windows");
        
            // JMenu Items to the toolWindow
            JMenuItem commit = new JMenuItem("Commit            Alt+0");
            JMenuItem project = new JMenuItem("Project");
            JMenuItem bookmarksView = new JMenuItem("Bookmarks");
            JMenuItem findView = new JMenuItem("Find            Alt+3");
            JMenuItem runView = new JMenuItem("Run              Alt+4");
            JMenuItem debugView = new JMenuItem("Debug          Alt+5");
            JMenuItem problemsView = new JMenuItem("Problems            Alt+6");
            JMenuItem structureView = new JMenuItem("Structure          Alt+7");
            JMenuItem servicesView = new JMenuItem("Services            Alt+8");
            JMenuItem gitView = new JMenuItem("Git          Alt+9");
            JMenuItem emulatorView = new JMenuItem("Emulator");
            JMenuItem profilerView = new JMenuItem("Profiler");
            JMenuItem appInspectionView = new JMenuItem("App Inspection");
            JMenuItem buildVariantView = new JMenuItem("Build Variant");
            JMenuItem dartAnalysis = new JMenuItem("Dart Analysis");
            JMenuItem deviceFileExplorerView = new JMenuItem("Device File Explorer");
            JMenuItem deviceManagerView = new JMenuItem("Device Manager");
            JMenuItem eventLogView = new JMenuItem("Event Log");
            JMenuItem flutterInspectorView = new JMenuItem("Flutter Inspector");
            JMenuItem flutterOutlineView = new JMenuItem("Flutter Outline");
            JMenuItem flutterPerformanceView = new JMenuItem("Flutter Performance");
            JMenuItem hierarchyView = new JMenuItem("Hierarchy");
            JMenuItem layoutInspectorView = new JMenuItem("Layout Inspector");
            JMenuItem logcatView = new JMenuItem("Logcat");
          
        JMenu appearance = new JMenu("Appearance");
        
            JMenuItem enterPresentationMode = new JMenuItem("Enter Presentation Mode");
            JMenuItem enterDistractionFreeMode = new JMenuItem("Enter Distraction Free Mode");
            JMenuItem enterFullScreen = new JMenuItem("Enter Full Screen");
            JMenuItem enterZenMode = new JMenuItem("Enter Zen Mode");
            JMenuItem mainMenu = new JMenuItem("Main Menu");
            JMenuItem toolbarApp = new JMenuItem("Toolbar");
            JMenuItem navigationBar = new JMenuItem("Navigation Bar");
            JMenuItem toolWindowBars = new JMenuItem("Tool Windows Bars");
            JMenuItem statusBar = new JMenuItem("Status Bar");
            
            JMenu statusBarWidgets = new JMenu("Status Bar Widgets");
            
                JMenuItem lineColumnNumber = new JMenuItem("Line:Column Number");
                JMenuItem lineSeparatorTool = new JMenuItem("Line Separator");
                JMenuItem fileEncodingTool = new JMenuItem("File Encoding");
                JMenuItem powerSaveMode = new JMenuItem("Power Save Mode");
                JMenuItem editorSelection  = new JMenuItem("Editor Selection Mode");
                JMenuItem indentation = new JMenuItem("Indentation");
                JMenuItem JSONSchema = new JMenuItem("JSON Schema");
                JMenuItem gitBranch = new JMenuItem("Git Brach");
                JMenuItem readOnlyAttribute = new JMenuItem("Read-Only Attribute");
                JMenuItem sendFeedbackToGoogle = new JMenuItem("Send Feedback to Google");
                JMenuItem memoryIndicator = new JMenuItem("Memory Indicator");
            
            JMenuItem detailsInTree = new JMenuItem("Details in Tree View");
            JMenuItem membersInNavigation = new JMenuItem("Members in Navigation Bar");
            
            // We continue adding the JMenuItems to appearance
            JMenuItem quickDefinition = new JMenuItem("Quick Definition             Ctrl+Maj+I");
            JMenuItem showSiblings = new JMenuItem("Show Siblings");
            JMenuItem quickTypeDefinition = new JMenuItem("Quick Type Definition");
            JMenuItem quickDocumentation = new JMenuItem("Quick Documentation           Ctrl+Q");
            JMenuItem parameterInfo = new JMenuItem("Parameter Info         Ctrl+P");
            JMenuItem contextInfo = new JMenuItem("Context Info Alt+Q");
            JMenuItem errorDescription = new JMenuItem("Error Description           Ctrl+F1");
            JMenuItem jumpToSource = new JMenuItem("Jump to Source");
            JMenuItem recentFiles = new JMenuItem("Recent Files         Ctrl+E");
            JMenuItem recentChangedFiles = new JMenuItem("Recent Changed Files");
            JMenuItem recentLocations = new JMenuItem("Recent Locations         Ctrl+Maj+E");
            JMenuItem recentChanges = new JMenuItem("Recent Changes         Alt+Maj+C");
            JMenuItem compareWith = new JMenuItem("Repair With...        Ctrl+D");
            JMenuItem compareWithClipbord = new JMenuItem("Repair With Clipboard");
            JMenuItem quickSwitchScheme = new JMenuItem("Quick Switch Scheme        Alt+'");
            
            JMenu activeEditor = new JMenu("Active Editor");
                
                JMenuItem softWrap = new JMenuItem("Soft-Wrap");
                JMenuItem showWhiteSpaces = new JMenuItem("Show White Spaces");
                JMenuItem showLineNumbers = new JMenuItem("Show Line Numbers");
                JMenuItem showGutterIcons = new JMenuItem("Show Gutter Icons");
                JMenuItem showIndentGuides = new JMenuItem("Show Indent Guides");
                JMenuItem showImportPopups = new JMenuItem("Show Import Popups");
            
            JMenu bidiTextBaseDirection = new JMenu("Bidi Text Base Direction");
                
                JMenuItem contentBased = new JMenuItem("Content-Based");
                JMenuItem leftToRight = new JMenuItem("Left-to-Right");
                JMenuItem rightToLeft = new JMenuItem("Right-to-Left");
            
    JMenu navigate = new JMenu("Navigate");
    
        // The JMenuItems for navigate
        JMenuItem backNavigate = new JMenuItem("Back                      Alt+Maj+Gauche");
        JMenuItem forwardNavigate = new JMenuItem("Forward                Alt+Maj+Droite");
        JMenuItem searchEverywhere = new JMenuItem("Search Everywhere");
        JMenuItem classNavigate = new JMenuItem("Class...                   Ctrl+N");
        JMenuItem fileNavigate = new JMenuItem("File...                     Ctrl+Maj+N");
        JMenuItem symbolNavigate = new JMenuItem("Symbol...                      Ctrl+Maj+N");
        JMenuItem lineColumnNavigate = new JMenuItem("Line Column...                Ctrl+G");
        JMenuItem nextHilightedErrorNavigate = new JMenuItem("Next Hilighted Error      F2");
        JMenuItem previousHilightedErrorNavigate = new JMenuItem("Previous Hilighted Error  Maj+F2");
        JMenuItem nextEmmetEditPoint = new JMenuItem("Next Emmet Edit Point         Alt+Maj+]");
        JMenuItem previousEmmetEditPoint = new JMenuItem("Previous Emmet Edit Point     Alt+Maj");
        JMenuItem lastEditLocation = new JMenuItem("Last Edit Location  Ctrl+Maj+Retour arrière");
        JMenuItem nextEditLocation = new JMenuItem("Next Edit Location");
        
        JMenu navigateInFile = new JMenu("Navigate in File");
        
            // The JMenuItems for navigate in file
            JMenuItem nextMethodNav = new JMenuItem("Next Method                Alt+Bas");
            JMenuItem previousMethodNav = new JMenuItem("Previous Method            Alt+Haut");
            JMenuItem moveCaretToMatchingBrace = new JMenuItem("Move Caret o Macthing Brace     Ctrl+Maj+M");
            JMenuItem nextLiveTemplateParameter = new JMenuItem("Next Live Template Parameter");
            JMenuItem previousLiveTemplateParameter = new JMenuItem("Previous Live Template Parameter");
            JMenuItem customFolding = new JMenuItem("Custom Folding...            Ctrl+Alt+.");
            JMenuItem nextChangeNav = new JMenuItem("Next Change                Ctrl+Alt+Maj+Bas");
            JMenuItem previousChangeNav = new JMenuItem("Previous Change            Ctrl+Alt+Maj+Haut");
        
        JMenuItem selectIn = new JMenuItem("Select In...        Alt+Maj+1");
        JMenuItem jumpToNavigationBar = new JMenuItem("Jump to Navigation Bar       Alt+Origine");
        JMenuItem declarationOrUsages = new JMenuItem("Declaration or Usages        Ctrl+B");
        JMenuItem implementations = new JMenuItem("Implementation(s)            Ctrl+Alt+B");
        JMenuItem typeDeclaration = new JMenuItem("Type Declaration             Ctrl+Maj+B");
        JMenuItem superMethod = new JMenuItem("Super Method                 Ctrl+U");
        JMenuItem testNavigate = new JMenuItem("Test                Ctrl+Maj+T");
        JMenuItem RelatedSymbol = new JMenuItem("Related Symbol...          Ctrl+Alt+Origine");
        JMenuItem headerSourceNavigate = new JMenuItem("Header/Source               F10");
        JMenuItem fileStructure = new JMenuItem("File Strucuture              Ctrl+F12");
        JMenuItem filePathNavigate = new JMenuItem("Imports Hierarchy           Alt+Maj+H");
        JMenuItem importHierarchy = new JMenuItem("Type Hierarchy               Ctrl+H");
        JMenuItem typeHierachy = new JMenuItem("Tyep Hierarchy              Ctrl+H");
        JMenuItem methodHierarchy = new JMenuItem("Method Hierarchy             Ctrl+Maj+H");
        JMenuItem callHierarchy = new JMenuItem("Call Hierarchy                 Ctrl+Alt+H");
        
        
    JMenu code = new JMenu("Code");
    
        // The JMenuItems for code
        JMenuItem overrideMethods = new JMenuItem("Override Methods...      Ctrl+O");
        JMenuItem implementMethods = new JMenuItem("Implement Methods...        Ctrl+I");
        JMenuItem delegateMethods = new JMenuItem("Delegate Methods...");
        JMenuItem generateCode = new JMenuItem("Generate...");
       
        JMenu codeCompletion = new JMenu("Code Completion");
            
            JMenuItem basicCodeCompletion = new JMenuItem("Basic        Ctrl+Espace");
            JMenuItem typeMatching = new JMenuItem("Type-Matching       Ctrl+Maj+Espace");
            JMenuItem completeCurrentStatement = new JMenuItem("Complete Current Statement      Ctrl+Maj+Entrée");
            JMenuItem cyclicExpandWord = new JMenuItem("Cyclic Expand Word      Alt+/");
            JMenuItem cyclicExpandWordBackward = new JMenuItem("Cyclic Expand Word (Backward)   Alt+Maj+/");
            
        JMenuItem inspectCode = new JMenuItem("Inspect Code...");
        JMenuItem codeCleanup = new JMenuItem("Code Cleanup...");
        
        JMenu analyzeCode = new JMenu("Analyze Code");
            
            // The JMenuItems for analyseCode
            JMenuItem silentCodeCleanup = new JMenuItem("Silent Code Cleanup");
            JMenuItem runInspectionByName = new JMenuItem("Run Inspection by Name...        Ctrl+Alt+Maj+I");
            JMenuItem configureCurrentFileAnalysis = new JMenuItem("Configure Current File Analysis...      Ctrl+Alt+Maj+H");
            JMenuItem viewOfflineInspectionResults = new JMenuItem("View Offline Inspection Results...");
            JMenuItem inferNullity = new JMenuItem("Infer Nullity...");
            JMenuItem dependanciesAnalyseCode = new JMenuItem("Dependancies...");
            JMenuItem backwardDependancies = new JMenuItem("Backward Dependancies...");
            JMenuItem moduleDependancies = new JMenuItem("Module Dependancies...");
            JMenuItem cyclicDependancies = new JMenuItem("Cyclic Dependancies...");
            JMenuItem dataFlowToHere = new JMenuItem("Data Flow to Here...");
            JMenuItem dataFlowFromHere = new JMenuItem("Data Flow from Here...");
        
        JMenuItem analyzeStackTrace = new JMenuItem("Analyze Stack Trace or Thread Dump...");
        JMenuItem insertLiveTemplate = new JMenuItem("Insert Live Template...       Ctrl+J");
        JMenuItem saveAsLiveTemplate = new JMenuItem("Save as Live Template...");
        JMenuItem surroundWith = new JMenuItem("Surround With...        Ctrl+Alt+T");
        JMenuItem unwrapRemove = new JMenuItem("Unwrap/Remove...        Ctrl+Maj+Supprimer");
        
        JMenu foldingCode = new JMenu("Folding");
            
            // JMenuItems for folding
            JMenuItem expandCode = new JMenuItem("Expand        Ctrl+Pané numérique +");
            JMenuItem expandRecursively = new JMenuItem("Expand Recursively         Ctrl+Alt+Pavé numérique +");
            JMenuItem expandAll = new JMenuItem("Expand All             Ctrl+Maj+Pavé numérique +");
            JMenuItem collapseCode = new JMenuItem("Collapse            Ctrl+Pané numérique");
            JMenuItem collapseRecursively = new JMenuItem("Collapse Recursively Ctrl+Alt+Pavé numérique -");
            JMenuItem collapseAll = new JMenuItem("Collapse All         Ctrl+Maj+Pavé numérique -");
        
            JMenu expandToLevel = new JMenu("Expand to Level");
                
                JMenuItem unCode = new JMenuItem("1     Ctrl+Pavé numérique *,1");
                JMenuItem deuxCode = new JMenuItem("2     Ctrl+Pavé numérique *,2");
                JMenuItem troisCode = new JMenuItem("3     Ctrl+Pavé numérique *,3");
                JMenuItem quatreCode = new JMenuItem("4     Ctrl+Pavé numérique *,4");
                JMenuItem cinqCode = new JMenuItem("5     Ctrl+Pavé numérique *,5");
            
            JMenu expandAllToLevel = new JMenu("Expand All to Level");
            
                JMenuItem unExpandAll = new JMenuItem("1        Ctrl+Maj+Pavé numérique*,1");
                JMenuItem deuxExpandAll = new JMenuItem("2        Ctrl+Maj+Pavé numérique*,2");
                JMenuItem troisExpandAll = new JMenuItem("3        Ctrl+Maj+Pavé numérique*,3");
                JMenuItem quatreExpandAll = new JMenuItem("4        Ctrl+Maj+Pavé numérique*,4");
                JMenuItem cinqExpandAll = new JMenuItem("5        Ctrl+Maj+Pavé numérique*,5");
            
            JMenuItem expandDocComments = new JMenuItem("Expand Doc Comments");
            JMenuItem collapseDocComments = new JMenuItem("Collapse Doc comments");
            JMenuItem foldSelectionRemove = new JMenuItem("Flod Selection/Remove region         Ctrl+.");
            JMenuItem foldCodeBlock = new JMenuItem("Fold Code Block        Ctrl+Maj+.");
            
        JMenuItem commentWithLineComment = new JMenuItem("Comment With Line Comment         Ctrl+/");
        JMenuItem commentWithBlockComment = new JMenuItem("Comment with Block Comment       Ctrl+Maj+/");
        JMenuItem reformatFile = new JMenuItem("Reformat File...            Ctrl+Alt+Maj+L");
        JMenuItem autoIndentLines = new JMenuItem("Auto-Indent Lines            Ctrl+Alt+I");
        JMenuItem rearrangeCode = new JMenuItem("Rearrange Code");
        JMenuItem moveStatementDown = new JMenuItem("Move Statement Down        Ctrl+Maj+Bas");
        JMenuItem moveStatementUp = new JMenuItem("Move Statement Haut          Ctrl+Maj+Haut");
        JMenuItem moveStatementLeft = new JMenuItem("Move Statement Left          Ctrl+Alt+Maj+Gauche");
        JMenuItem moveStatementRight = new JMenuItem("Move Statement Haut          Ctrl+Alt+Maj+Droite");
        JMenuItem moveLineDown = new JMenuItem("Move Line Down");
        JMenuItem moveLineUp = new JMenuItem("Move Line Up");
        JMenuItem updateCopyRight = new JMenuItem("Update Copyright...");
        JMenuItem generateModuleInfoDescriptors = new JMenuItem("Generate module-info Descriptors");
        
        // Les JMenuItems pour refactor
        JMenuItem refactorThis = new JMenuItem("Refactor This...            Ctrl+Alt+Shift+T");
        JMenuItem renameRefactor = new JMenuItem("Rename...             Shift+F6");
        JMenuItem renameFileRefactor = new JMenuItem("Rename File...");
        
        JMenu extractIntroduce = new JMenu("Extract/Introduce");
        
            // Les JMenuItems pour extract/introduce
            JMenuItem variableRefactor = new JMenuItem("Variable...             Ctrl+Alt+V");
            JMenuItem methodRefactor = new JMenuItem("Method...             Ctrl+Alt+M");
            JMenuItem extractFlutterWidget = new JMenuItem("Extract Flutter Widget...       Ctrl+Alt+W");
            
        JMenuItem inlineRefactor = new JMenuItem("Inline...             Ctrl+Alt+N");
        JMenuItem moveFile = new JMenuItem("Move File...            F6");
        JMenuItem copyFile = new JMenuItem("Copy File...            F5");
        JMenuItem safeDeleteRefactor = new JMenuItem("Safe Delete...            Alt+Delete");
        
        JMenu migratePackages = new JMenu("Migrage Packages and Classes");
        
            JMenuItem jUnit4 = new JMenuItem("JUnit(4.x -> 5.0");
            JMenuItem createNewMigration = new JMenuItem("Create New Migration...");
        
        JMenuItem invertBoolean = new JMenuItem("Invert Boolean...");
        JMenuItem internationalize = new JMenuItem("Internationalize...");
        JMenuItem removeUnusedResources = new JMenuItem("Remove Unused Resources...");
        JMenuItem migrateToAppCompat = new JMenuItem("Migrate to AppCompat...");
        JMenuItem migrateToAndroidX = new JMenuItem("Migrate to AndroidX...");
        JMenuItem migrateToNonTransitive = new JMenuItem("Migrate to Non-Transitive R Classes...");
        JMenuItem addRightToLeft = new JMenuItem("Add Right-to-Left (RTL) Support...");
            
    JMenu refactor = new JMenu("Refactor");
    
    JMenu build = new JMenu("Build");
    
        // We add the things for the build
        JMenu flutterBuild = new JMenu("Flutter");
        
            // We add the jmenuitems for the flutterBuild
            JMenuItem buildAAR = new JMenuItem("Build AAR");
            JMenuItem buildAPK = new JMenuItem("Build APK");
            JMenuItem buildAppBundle = new JMenuItem("Build App Bundle");
            JMenuItem buildIOS = new JMenuItem("Build iOS");
            JMenuItem buildWeb = new JMenuItem("Build Web");
            
        // We continue adding the jmenuitems for the build
        JMenuItem recompileMainDart = new JMenuItem("Recompile 'main.dart'");
        JMenuItem buildBundlesApk = new JMenuItem("Build Bundle(s) / APK(s)");
        JMenuItem analyseAPK = new JMenuItem("Analyze APK");
        JMenuItem deployModuleToAppEngine = new JMenuItem("Deploy Module to App Engine...");
        JMenuItem analyseBuildPerformance  = new JMenuItem("Analyse Build Performance");
    
    JMenu run = new JMenu("Run");
    
        // The jmenuitems for run
        JMenuItem runMainDart = new JMenuItem("Run 'main.dart'      Shift+F10");
        JMenuItem debugMainDart = new JMenuItem("Debug 'main.dart'      Shift+F9");
        JMenuItem runMainDartWithCoverage = new JMenuItem("Run 'main.dart' with Coverage");
        JMenuItem runMainDart2 = new JMenuItem("Run 'main.dart'");
        JMenuItem runRun = new JMenuItem("Run...            Alt+Shift+F10");
        JMenuItem debugRun = new JMenuItem("Debug...        Alt+Shift+F9");
        JMenuItem profilRun = new JMenuItem("Profile...");
        JMenuItem recordEspressoTest = new JMenuItem("Record Espresso Test");
        JMenuItem attachToProcess = new JMenuItem("Attach to Process...         Ctrl+Alt+5");
        JMenuItem editConfigurationsRun = new JMenuItem("Edit Configurations...");
        JMenuItem selectDevice = new JMenuItem("Select Device...        Alt+Shift+F11");
        JMenuItem stopRun = new JMenuItem("Stop             Ctrl+F2");
        JMenuItem flutterHotReload = new JMenuItem("Flutter Hot Reload      Ctrl+\\");
        JMenuItem flutterHotRestart = new JMenuItem("Flutter Hot Restart        Ctrl+Shift+\\");
        JMenuItem flutterHotReloadAllDevices = new JMenuItem("Flutter Hot Reload (All Devices)  Ctrl+Alt+\\");
        JMenuItem flutterHotRestartAllDevices = new JMenuItem("Flutter Hot Restart (All Devices) Ctrl+Alt+Shift+\\");
        JMenuItem flutterRunMainDartInProfileMode = new JMenuItem("Flutter Run 'main.dart' in Profile Mode");
        JMenuItem flutterRunMainDartInReleaseMode = new JMenuItem("Flutter Run 'main.dart'in Release Mode");
        JMenuItem flutterAttachRun = new JMenuItem("Flutter Attach");
        JMenuItem stopBackgroundProcesses = new JMenuItem("Stop Background Processes        Ctrl+Shift+F2");
        JMenuItem showRunningList = new JMenuItem("Show Running List");
        
        // Le jmenu
        JMenu debuggingActions = new JMenu("Debugging Actions");
        
            // Les JMenuItems de debugging action
            JMenuItem stepOver = new JMenuItem("Step Over       F8");
            JMenuItem forceStepOver = new JMenuItem("Froce Step Over    Alt+Shift+F8");
            JMenuItem stepInto = new JMenuItem("Step Into           F7");
            JMenuItem forceStepInto = new JMenuItem("Force Step Into");
            JMenuItem smartStepInto = new JMenuItem("Smart Step Into");
            JMenuItem stepOut = new JMenuItem("Step Out         Shift+F8");
            JMenuItem runToCursor = new JMenuItem("Run to Cursor        Alt+Shift+9");
            JMenuItem forceRunToCursor = new JMenuItem("Force Run to Cursor         Ctrl+Alt+9");
            JMenuItem resetFrame = new JMenuItem("Reset Frame");
            JMenuItem forceReturn = new JMenuItem("Froce Return");
            JMenuItem throwException = new JMenuItem("Throw Exception");
            JMenuItem resumeProgram = new JMenuItem("Resume Program     F9");
            JMenuItem evaluateExpression = new JMenuItem("Evaluate Expression...        Alt+F8");
            JMenuItem quickEvaluateExpression = new JMenuItem("Quick Evaluate Expression       Ctrl+Alt+8");
            JMenuItem showExecutionPoint = new JMenuItem("Show Execution Point      Alt+F19");
            JMenuItem getThreadDump = new JMenuItem("Get Thread Dump");
            
        JMenu toogleBreakpoint = new JMenu("Toogle Breakpoint");
        
            // JMenuItems for toogleBreakpoint
            JMenuItem lineBreakpoint = new JMenuItem("Line Breakpoint       Ctrl+F8");
            JMenuItem methodBreakpoint = new JMenuItem("Method Breakpoint");
            JMenuItem temporaryLineBreakpoint = new JMenuItem("Temporary Line Breakpoint  Ctrl+Alt+Shift+F8");
            JMenuItem toogleBreakpointEnabled = new JMenuItem("Toogle Breakpoint Enabled");
            
        JMenuItem viewBreakpoints = new JMenuItem("View Breakpoints...      Ctrl+Shift+F8");
        JMenuItem testHistory = new JMenuItem("Test History");
        JMenuItem importTestFromFile = new JMenuItem("Import Test from File...");
        JMenuItem showCoverageData = new JMenuItem("Show Coverage Data...       Ctrl+Alt+6");
        JMenuItem attachDebuggerToAndroidProcess = new JMenuItem("Attach Debugger to Android Process");
        
    JMenu tools = new JMenu("Tools");
    
        // Les jmenus et les jmenuitems de tools
        JMenu taskEtContexts = new JMenu("Task & Contexts");
        
            // Les jmenuitems du task && contexts
            JMenuItem switchTask = new JMenuItem("Switch Task...        Alt+Shift+T");
            JMenuItem openTask = new JMenuItem("Open Task...        Alt+Shift+N");
            JMenuItem closeActiveTask = new JMenuItem("Close Active Task...        Alt+Shift+W");
            JMenuItem editDefaultTask = new JMenuItem("Edit 'Default Task'");
            JMenuItem createChangelist = new JMenuItem("Create Changelist...");
            JMenuItem showDescription = new JMenuItem("Show Description");
            JMenuItem openInBrowser = new JMenuItem("Open in Browser        Alt+Shift+B");
            JMenuItem analyzeStackTraceFromTask = new JMenuItem("Analyze Stack Trace From Task...");
            JMenuItem configureServers = new JMenuItem("AConfigure Servers...");
            JMenuItem saveContext = new JMenuItem("Save Context...     Alt+Shift+S");
            JMenuItem loadContext = new JMenuItem("Load Context...     Alt+Shift+L");
            JMenuItem clearContext = new JMenuItem("Clear Context...     Alt+Shift+X");
            
        JMenuItem generateJavaDoc = new JMenuItem("Generate JavaDoc...");
        JMenuItem createCommandLineLaucher = new JMenuItem("Create Cpmmand-line Launcher...");
        JMenuItem createDesktopEntry = new JMenuItem("Create Desktop Entry...");
        
        JMenu xmlActions = new JMenu("XML Actions");
        
            JMenuItem generateDTDFromXMLFile = new JMenuItem("Generate DTD from XML File");
            JMenuItem convertSchema = new JMenuItem("Convert Schema...");
            JMenuItem generateXSDSchemaFromXMLFile = new JMenuItem("Generate XSD Schema from XML File...");
            JMenuItem generateXMLDocumentFromXSDSchema = new JMenuItem("Generate XML Document from XSD Schema...");
            
        JMenu markdownConverter = new JMenu("Markdown Converter");
        
            // Les jmenuitems de markdown converter
            JMenuItem importWordDocument = new JMenuItem("Import Word Document...");
            JMenuItem exportMarkdownFileTo = new JMenuItem("Export Markdown File To...");
            JMenuItem configurePandoc = new JMenuItem("Configure Pandoc...");
            
        JMenuItem jShellConsole = new JMenuItem("JSell Console...");
        
        JMenu clingTools = new JMenu("Cling");
        
            JMenuItem startNewClingSession = new JMenuItem("Start New Cling Session...");
            JMenuItem sendIncludedHeadersToCling = new JMenuItem("Send Included Headers to Cling");
            JMenuItem sendToCling = new JMenuItem("Send to Cling");
        
        JMenu kotlinTools = new JMenu("Kotlin");
        
            JMenuItem configureKotlinPluginUPdates = new JMenuItem("Configure Kotlin Plugin Updates");
            JMenuItem enableMigrationsDetection = new JMenuItem("Enable Migrations Detection");
            JMenuItem kotlinREPLExperimantal = new JMenuItem("Kotlin REPL (Experimental)");
            JMenuItem configureKotlinInProject = new JMenuItem("Configure Kotlin in Project");
            JMenuItem configureKotlinJavaScriptInProject = new JMenuItem("Configure Kotlin (JavaScript) in Project");
            JMenuItem showKotlinBytecode = new JMenuItem("Show Kotlin Bytecode");
            JMenuItem decompileToJava = new JMenuItem("Decompile to Java");
            
        JMenuItem deviceManagerTools = new JMenuItem("Device Manager");
        JMenuItem sdkManager = new JMenuItem("SDK Manager");
        JMenuItem resourceManager = new JMenuItem("Resource Manager");
        JMenuItem troubleshootDeviceConnections = new JMenuItem("Troubleshoot Device Connections");
        JMenuItem androidSDKUpgradeAssistant = new JMenuItem("Android SDK Upgrage Assistant");
        JMenuItem firebaseTools = new JMenuItem("Firebase");
        JMenuItem appLinksAssistant = new JMenuItem("App Links Assistant");
        JMenuItem layoutInspector = new JMenuItem("Layout Inspector");
        JMenuItem agpUpgradeAssistant = new JMenuItem("AGP Upgrade Assistant...");
        
        JMenu flutterTools = new JMenu("Flutter");
        
            JMenuItem gettingStarted = new JMenuItem("Getting Started");
            JMenuItem flutterUpgrade = new JMenuItem("Flutter Upgrade");
            JMenuItem flutterDoctor = new JMenuItem("Flutter Doctor");
            JMenuItem flutterPubGet = new JMenuItem("Flutter Pub Get");
            JMenuItem flutterPubUpgrade = new JMenuItem("Flutter Pub Upgrade");
            JMenuItem flutterClean = new JMenuItem("Flutter Clean");
            JMenuItem openFlutterDevTools = new JMenuItem("Open Flutter DevTools");
            JMenuItem openForEditingInAndroidStudio = new JMenuItem("Open for Editing in Android Studio");
            JMenuItem submitFeedback = new JMenuItem("Submit Feedback...");
    
    JMenu vcs = new JMenu("VCS");
    
        // Les jmenuitems de vcs
        JMenuItem enableVersionControlIntegration = new JMenuItem("Enable Version Control Integration...");
        JMenuItem vcsOperationsPopup = new JMenuItem("VCS Operations Popup...");
        JMenuItem applyPatch = new JMenuItem("Apply Patch...");
        JMenuItem applyPatchFromClipboard = new JMenuItem("Apply Patch from Clipboard");
        JMenuItem getProjectFromVersionControl = new JMenuItem("Get project from Version Control");
        
        JMenu browseVCSRepository = new JMenu("Browse VCS Repository");
        
            JMenuItem showGitRepositoryLog = new JMenuItem("Show Git Repository Log...");
            JMenuItem browseSubversionRepository = new JMenuItem("Browse Subversion Repository...");
            
        JMenuItem createMercurialRepository = new JMenuItem("Create Mercurial Repository");    
        JMenuItem createGitRepository = new JMenuItem("Create Git Repository...");
        JMenuItem shareProjectOnGitHub = new JMenuItem("Share Project on GitHub");
        JMenuItem setupOnGoogleCloudSourceRepositories = new JMenuItem("Setup on Google Cloud Source Repositories...");
        JMenuItem importIntoSubversion = new JMenuItem("Import into Subversion...");
        JMenuItem shareProjectSubverion = new JMenuItem("Share Project (Subversion)...");
        
    JMenu window = new JMenu("Window");

        JMenuItem storeCurrentLayoutAsDefault = new JMenuItem("Store Current Layout as Default");
        JMenuItem restoreDefaultLayout = new JMenuItem("Restore Default Layout      Shift+F12");
        
        JMenu storeLayout = new JMenu("Store Layout");
        
            JMenuItem defaultStoreLayout = new JMenuItem("Default");
            JMenuItem newStoreLayout = new JMenuItem("New");
            
        JMenu restoreLayout = new JMenu("Restore Layout");
        
            JMenuItem defaultRestoreLayout = new JMenuItem("Default");
            
        JMenu deleteLayout = new JMenu("Delete Layout");
        
        JMenu activeToolWindow = new JMenu("Active Tool Window");
        
            JMenuItem hideActiveToolWindow = new JMenuItem("Hide Active Tool Window     Shift+Ecape");
            JMenuItem hideSideToolWindows = new JMenuItem("Hide Side Tool Window");
            JMenuItem hideAllToolWindows = new JMenuItem("Hide All Tool Window Ctrl+Shift+F12");
            JMenuItem closeActiveTab = new JMenuItem("Close Active Tab    Ctrl+Shift+F4");
            JMenuItem jumpToLastToolWindow = new JMenuItem("Jump to Last Tool Window        F12");
            JMenuItem maximizeToolWindow = new JMenuItem("Maximize Tool Window       Ctrl+Shift+Quote");
            
            JMenu viewMode = new JMenu("View Mode");
            JMenu moveTo = new JMenu("Move To");
            
            JMenuItem groupTabs = new JMenu("Group Tabs");
            
            JMenu resize = new JMenu("Resize");
            
        JMenu editorTabs = new JMenu("Editor Tabs");
        
            JMenuItem selectNextTab = new JMenuItem("Select Next Tab        Alt+Right");
            JMenuItem selectPreviousTab = new JMenuItem("Select Previous Tab        Alt+Left");
            JMenuItem pinTab = new JMenuItem("Pin Tab");
            JMenuItem keepTabOpen = new JMenuItem("Keep Tab Open");
            JMenuItem closeTab = new JMenuItem("Close Tab");
            JMenuItem closeOtherTabs = new JMenuItem("Close Other Tabs");
            JMenuItem closeAllTabs = new JMenuItem("Close All Tabs");
            JMenuItem closeUnmodifiedTabs = new JMenuItem("Close Unmodified Tabs");
            JMenuItem closeAllButPinned = new JMenuItem("Close All But Pinned");
            JMenuItem closeTabsToTheLeft = new JMenuItem("Close Tabs to the Left");
            JMenuItem closeTabsToTheRight = new JMenuItem("Close Tabs to the Right");
            JMenuItem closeAllReadOnly = new JMenuItem("Close All Read-Only");
            JMenuItem reopenClosedTab = new JMenuItem("Reopen Closed Tab");
            JMenuItem splitRight = new JMenuItem("Split Right");
            JMenuItem splitDown = new JMenuItem("Split Down");
            JMenuItem stretchEditorToTop = new JMenuItem("Stretch Editor to Top");
            JMenuItem stretchEditorToLeft = new JMenuItem("Stretch Editor to Left");
            JMenuItem stretchEditorToBottom = new JMenuItem("Stretch Editor to Bottom");
            JMenuItem stretchEditorToRight = new JMenuItem("Stretch Editor to Right");
            JMenuItem changeSplitterOrientation = new JMenuItem("Change Splittser Orientation");
            JMenuItem maximizeEditorNormalizeSplits = new JMenuItem("Maximize Editor/Normalize Splits");
            JMenuItem unsplit = new JMenuItem("Unsplit");
            JMenuItem unsplitAll = new JMenuItem("Unsplit All");
            JMenuItem gotoNextSplitter = new JMenuItem("Goto Next Splitter");
            JMenuItem gotoPreviousSplitter = new JMenuItem("Goto Previous Splitter");
            JMenuItem configureEditorTabs = new JMenuItem("Configure Editor Tabs...");
    
        JMenu notifications = new JMenu("Notifications");
        
            JMenuItem closeFirst = new JMenuItem("Close First");
            JMenuItem closeAll = new JMenuItem("Close All");
            
        JMenu backgroundTasks = new JMenu("Background Tasks");
        
            JMenuItem showBackgroundTasks = new JMenuItem("Show");
            JMenuItem autoShowBackgroundTasks = new JMenuItem("Auto Show");
            
        JMenuItem nextProjectWindow = new JMenuItem("Next Project Window        Ctrl+Alt+]");    
        JMenuItem previousProjectWindow = new JMenuItem("Previous Project Window        Ctrl+Alt+[");    
            
    JMenu help = new JMenu("Help");
    
        JMenuItem findAction = new JMenuItem("Find Action...        Ctrl+Shift+A");
        JMenuItem androidStudioHelp = new JMenuItem("Android Studio Help");
        JMenuItem flutterPluginHelp = new JMenuItem("Flutter Plugin Help");
        JMenuItem intellijIdeaHelp = new JMenuItem("IntelliJ IDEA Help");
        JMenuItem whatsNewInAndroidStudio = new JMenuItem("What's New in Android Studio");
        JMenuItem gettingStartedHelp = new JMenuItem("Getting Started");
        JMenuItem androidStudioOnYoutube = new JMenuItem("Android Studio on YouTube");
        JMenuItem licencesHelp = new JMenuItem("Licenses");
        JMenuItem keyBoardShortcutsPDF = new JMenuItem("Keyboard Shortcuts PDF");
        JMenuItem tipOfTheDay = new JMenuItem("Tip of the Day");
        JMenuItem myProductivity = new JMenuItem("My Productivity");
        JMenuItem submitFeedbackHelp = new JMenuItem("Submit Feedback");
        JMenuItem showLogInVisualStudioCode = new JMenuItem("Show Log in Visual Studio Code");
        JMenuItem collectLogsAndDiagnosticData = new JMenuItem("Collect Logs and Diagnostic Data");
        JMenuItem analyzeMemoryUsage = new JMenuItem("Analyze Memory Usage");
        JMenuItem deleteLeftOverIdeDirectories = new JMenuItem("Delete Leftover IDE Directories...");
        
        JMenu diagnosticTools = new JMenu("Dagnostic Tools");
        
            JMenuItem activityMonitor = new JMenuItem("Activity Monitor...");            
            JMenuItem analyzePluginStartupPerformance = new JMenuItem("Analyze Plugin Startup Performance");
            JMenuItem dumpThreads = new JMenuItem("Dump Threads");
            JMenuItem debugLogSettings = new JMenuItem("Debug Log Settings...");
            JMenuItem ccppEnableEventTracing = new JMenuItem("C/C++: Enable Event Tracing");
            JMenuItem executePerformanceScript = new JMenuItem("Execute Performance Script...");
            JMenuItem traceResourceUpdates = new JMenuItem("Trace Resource Updates");
            JMenuItem dumpResourceTrace = new JMenuItem("Dump Resource Trace");
            JMenuItem openIndexingDiagnostics = new JMenuItem("Open Indexing Diagnostics");

        JMenuItem changeMemorySettings = new JMenuItem("Chage Memory Settings");
        JMenuItem editCustomProperties = new JMenuItem("Edit Custom Properties...");
        JMenuItem editCustomVMOptions = new JMenuItem("Edit Custom VM Options...");
        JMenuItem checkForUpdates = new JMenuItem("Check for Updates...");
        JMenuItem aboutHelp = new JMenuItem("About");


    // Constructor
    public Panneau1Haut(Fenetre fenetre) {
        
        this.fenetre = fenetre;
        
        /// setBackground(new Color(135, 206, 235));
        /**1111111111111111111111
         Pour ajouter des sous-menus à un élément de menu, vous pouvez créer un 
         * autre JMenu et l'ajouter à l'élément de menu parent.
         */
        // Submenus
        nouveau.add(nouveauProjet);
        nouveau.add(importProject);
        nouveau.add(projectFrom);
        nouveau.add(importModule);
        nouveau.add(importSample);
        nouveau.add(javaClass);
        nouveau.add(kotlinClass);
        nouveau.add(fileSubMenu);
        nouveau.add(scratchFile);
        nouveau.add(packageSubMenu);
        nouveau.add(moduleInfo);
        nouveau.add(cmakeLists);
        nouveau.add(dartFile);
        nouveau.add(resourceBundle);
        nouveau.add(editorConfigFile);
        
        // We add the jmenuItems to the file JMenu
        file.add(nouveau);  
        file.add(open);
        file.add(profile); 
        
        // In recent, we add its subMenus
        recent.add(myApplication);
        recent.add(manageProjects);
        
        file.add(recent);
        file.add(closeP);   
        file.add(settings);
        file.add(projectStructure);
        
            // We add JMenuItems to the fileProperties
            fileProperties.add(fileEncoding);
            fileProperties.add(removeBOM);
            fileProperties.add(addBOM);
            fileProperties.add(associateWithFile);
            fileProperties.add(makeFileReady);
                // JMenuItems for lineSeparator
                lineSeparator.add(crlfWindows);
                lineSeparator.add(lfUnix);
                lineSeparator.add(crClassic);
                
            fileProperties.add(lineSeparator);
        
        file.add(fileProperties);
        
            // We add JMenuItems in localHistory
            localHistory.add(showHistory);
            localHistory.add(showHistoryForSelection);
            localHistory.add(putLabel);
        
        file.add(localHistory);
        file.add(saveAll);  
        file.add(reloadAll);
        file.add(repairIDE);
        file.add(invalidateCaches);
        
            // We add the JMenuItems of manage
            manage.add(importSettings);
            manage.add(exportSettings);
            manage.add(restoreDefaultSettings);
            manage.add(settingsSychronise);
        
        file.add(manage);
        
            // We add the JMenuItems in newProject
            newProject.add(settingsForNewProject);
            newProject.add(runConfiguration);
            newProject.add(defaultProjectStructure);
        
        file.add(newProject);
            
            export.add(filesOrSelection);
            export.add(exportToZip);
        
        file.add(export);   
        file.add(print);
        file.add(powerSave);
        file.add(essential);
        
            // Nous ajoutons une actions sur le bouton exit
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Nous fermons la fenetre lorsqu'on clique sur le bouton exit
                    fenetre.dispose();
                }
            });
        
        file.add(exit);
        
        // We add fileMenuBar to the JMenuBar
        this.add(file);
        
            // We add JMenuItems to edit
            edit.add(undo);
            edit.add(redo);
            edit.add(cut);
            edit.add(copy);
            edit.add(copyPathReference);
            
                // We add JMenuItems to paste
                paste.add(pasteSubMenu);
                paste.add(pasteFromHistory);
                paste.add(pasteAsPlainText);
                
            edit.add(paste);
            edit.add(delete);
                
                // We add the JMenuItems to the find
                find.add(findSubMenu);
                find.add(replace);
                find.add(findNext);
                find.add(findPrevious);
                find.add(selectAllOccurrences);
                find.add(addSelectionForNext);
                find.add(unselectOccurrence);
                find.add(searchInSelection);
                find.add(nextOccurrenceOfTheWord);
                find.add(previousOccurenceOfTheWord);
                find.add(findInFiles);
                find.add(replaceInFiles);
                find.add(searchStructurally);
                find.add(replaceStructurally);
                find.add(evaluateJSONPath);
            
            edit.add(find);
            
                // JMenuItems for findUsages
                findUsages.add(findUsagesSubMenu);
                findUsages.add(findUsageSettings);
                findUsages.add(showUsages);
                findUsages.add(findUsagesInFile);
                findUsages.add(highlightUsageInFile);
                findUsages.add(nextHilightedUsage);
                findUsages.add(previousHilightedUsage);
                findUsages.add(recentFindUsages);
            
            edit.add(findUsages);
            
            // We continue adding the JMenuItems
            edit.add(columnSelectionMode);
            edit.add(selectAll2);
            edit.add(addCaretsToEnds);
            edit.add(extendsSelection);
            edit.add(shrinkSelection);
            edit.add(toggleCase);
            edit.add(joinLines);
            edit.add(duplicateLine);
            edit.add(fillParagraph);
            edit.add(sortLines);
            edit.add(reverseLines);
            edit.add(transpose);
            edit.add(indentSelection);
            edit.add(unindentLine);
                
                // We must add the JMenuItems
                convertIndents.add(toSpaces);
                convertIndents.add(toTabs);
               
            edit.add(convertIndents);
                
                // Adding the JMenuItems
                macros.add(playBack);
                macros.add(startMacro);
                macros.add(editMacro);
                macros.add(playSaved);
            edit.add(macros);
            
                // Adding the JMenuItems
                bookmarks.add(previousLineBookmark);
                bookmarks.add(nextLineBookmark);
                bookmarks.add(showLineBookmarks);
                bookmarks.add(goToMnemonic);
                
            edit.add(bookmarks);

            
        this.add(edit);
                
                // Tool Window and his childre
                toolWindows.add(commit);
                toolWindows.add(project);
                toolWindows.add(bookmarksView);
                toolWindows.add(findView);
                toolWindows.add(runView);
                toolWindows.add(debugView);
                toolWindows.add(problemsView);
                toolWindows.add(structureView);
                toolWindows.add(servicesView);
                toolWindows.add(gitView);
                toolWindows.add(emulatorView);
                toolWindows.add(profilerView);
                toolWindows.add(appInspectionView);
                toolWindows.add(buildVariantView);
                toolWindows.add(dartAnalysis);
                toolWindows.add(deviceFileExplorerView);
                toolWindows.add(deviceManagerView);
                toolWindows.add(eventLogView);
                toolWindows.add(flutterInspectorView);
                toolWindows.add(flutterOutlineView);
                toolWindows.add(flutterPerformanceView);
                toolWindows.add(hierarchyView);
                toolWindows.add(layoutInspectorView);
                toolWindows.add(logcatView);
        
            // View and it's children
            view.add(toolWindows);
            
                // We add the JMenuItem of appearance
                appearance.add(enterPresentationMode);
                appearance.add(enterDistractionFreeMode);
                appearance.add(enterFullScreen);
                appearance.add(enterZenMode);
                appearance.add(mainMenu);
                appearance.add(toolbarApp);
                appearance.add(navigationBar);
                appearance.add(toolWindowBars);
                appearance.add(statusBar);
                
                    statusBarWidgets.add(lineColumnNumber);
                    statusBarWidgets.add(lineSeparatorTool);
                    statusBarWidgets.add(fileEncodingTool);
                    statusBarWidgets.add(powerSaveMode);
                    statusBarWidgets.add(editorSelection);
                    statusBarWidgets.add(indentation);
                    statusBarWidgets.add(JSONSchema);
                    statusBarWidgets.add(gitBranch);
                    statusBarWidgets.add(readOnlyAttribute);
                    statusBarWidgets.add(sendFeedbackToGoogle);
                    statusBarWidgets.add(memoryIndicator);

                appearance.add(statusBarWidgets);
                appearance.add(detailsInTree);
                appearance.add(membersInNavigation);
                
            view.add(appearance);
                
            view.add(quickDefinition);
            view.add(showSiblings);
            view.add(quickTypeDefinition);
            view.add(quickDocumentation);
            view.add(parameterInfo);
            view.add(contextInfo);
            view.add(errorDescription);
            view.add(jumpToSource);
            view.add(recentFiles);
            view.add(recentChangedFiles);
            view.add(recentLocations);
            view.add(recentChanges);
            view.add(compareWith);
            view.add(compareWithClipbord);
            view.add(quickSwitchScheme);
            
                // Now for active editor
                activeEditor.add(softWrap);
                activeEditor.add(showWhiteSpaces);
                activeEditor.add(showLineNumbers);
                activeEditor.add(showGutterIcons);
                activeEditor.add(showIndentGuides);
                activeEditor.add(showImportPopups);

            view.add(activeEditor);
            
                bidiTextBaseDirection.add(contentBased);
                bidiTextBaseDirection.add(leftToRight);
                bidiTextBaseDirection.add(rightToLeft);
                
            view.add(bidiTextBaseDirection);
                
        this.add(view);
        
            // Nous ajoutons les JMenuItems pour navigate
            navigate.add(backNavigate);
            navigate.add(forwardNavigate);
            navigate.add(searchEverywhere);
            navigate.add(classNavigate);
            navigate.add(fileNavigate);
            navigate.add(symbolNavigate);
            navigate.add(lineColumnNavigate);
            navigate.add(nextHilightedErrorNavigate);
            navigate.add(previousHilightedErrorNavigate);
            navigate.add(nextEmmetEditPoint);
            navigate.add(previousEmmetEditPoint);
            navigate.add(lastEditLocation);
            navigate.add(nextEditLocation);
            
                // We add the JMenuItems to the navigateInFile
                navigateInFile.add(nextMethodNav);
                navigateInFile.add(previousMethodNav);
                navigateInFile.add(moveCaretToMatchingBrace);
                navigateInFile.add(nextLiveTemplateParameter);
                navigateInFile.add(previousLiveTemplateParameter);
                navigateInFile.add(customFolding);
                navigateInFile.add(nextChangeNav);
                navigateInFile.add(previousChangeNav);
            
            navigate.add(navigateInFile);
            navigate.add(selectIn);
            navigate.add(jumpToNavigationBar);
            navigate.add(declarationOrUsages);
            navigate.add(implementations);
            navigate.add(typeDeclaration);
            navigate.add(superMethod);
            navigate.add(testNavigate);
            navigate.add(RelatedSymbol);
            navigate.add(headerSourceNavigate);
            navigate.add(fileStructure);
            navigate.add(filePathNavigate);
            navigate.add(importHierarchy);
            navigate.add(typeHierachy);
            navigate.add(methodHierarchy);
            navigate.add(callHierarchy);
        
        this.add(navigate);
        
            // We add the JMenuItems for code
            code.add(overrideMethods);
            code.add(implementMethods);
            code.add(delegateMethods);
            code.add(generateCode);
            
                // We add the JMenuItems for the codeCompletion
                codeCompletion.add(basicCodeCompletion);
                codeCompletion.add(typeMatching);
                codeCompletion.add(completeCurrentStatement);
                codeCompletion.add(cyclicExpandWord);
                codeCompletion.add(cyclicExpandWordBackward);
            
            code.add(codeCompletion);
            code.add(inspectCode);
            code.add(codeCleanup);
            
                // We add the JMenuItems for the analyse code
                analyzeCode.add(silentCodeCleanup);
                analyzeCode.add(runInspectionByName);
                analyzeCode.add(configureCurrentFileAnalysis);
                analyzeCode.add(viewOfflineInspectionResults);
                analyzeCode.add(inferNullity);
                analyzeCode.add(dependanciesAnalyseCode);
                analyzeCode.add(backwardDependancies);
                analyzeCode.add(moduleDependancies);
                analyzeCode.add(cyclicDependancies);
                analyzeCode.add(dataFlowToHere);
                analyzeCode.add(dataFlowFromHere);
            
            code.add(analyzeCode);
            
            code.add(analyzeStackTrace);
            code.add(insertLiveTemplate);
            code.add(saveAsLiveTemplate);
            code.add(surroundWith);
            code.add(unwrapRemove);
            
                // We add the JMenuItems for folding
                foldingCode.add(expandCode);
                foldingCode.add(expandRecursively);
                foldingCode.add(expandAll);
                foldingCode.add(collapseCode);
                foldingCode.add(collapseRecursively);
                foldingCode.add(collapseAll);
                
                    expandToLevel.add(unCode);
                    expandToLevel.add(deuxCode);
                    expandToLevel.add(troisCode);
                    expandToLevel.add(quatreCode);
                    expandToLevel.add(cinqCode);
                
                foldingCode.add(expandToLevel);
                
                    expandAllToLevel.add(unExpandAll);
                    expandAllToLevel.add(deuxExpandAll);
                    expandAllToLevel.add(troisExpandAll);
                    expandAllToLevel.add(quatreExpandAll);
                    expandAllToLevel.add(cinqExpandAll);
                
                foldingCode.add(expandAllToLevel);
                foldingCode.add(expandDocComments);
                foldingCode.add(collapseDocComments);
                foldingCode.add(foldSelectionRemove);
                foldingCode.add(foldCodeBlock);
            
            code.add(foldingCode);
            code.add(commentWithLineComment);
            code.add(commentWithBlockComment);
            code.add(reformatFile);
            code.add(autoIndentLines);
            code.add(rearrangeCode);
            code.add(moveStatementDown);
            code.add(moveStatementUp);
            code.add(moveStatementLeft);
            code.add(moveStatementRight);
            code.add(moveLineDown);
            code.add(moveLineUp);
            code.add(updateCopyRight);
            code.add(generateModuleInfoDescriptors);
            
        this.add(code);
        
            // Nous ajoutons les jmenuitems au refactor
            refactor.add(refactorThis);
            refactor.add(renameRefactor);
            refactor.add(renameFileRefactor);
            
                extractIntroduce.add(variableRefactor);
                extractIntroduce.add(methodRefactor);
                extractIntroduce.add(extractFlutterWidget);
            
            refactor.add(extractIntroduce);
            refactor.add(inlineRefactor);
            refactor.add(moveFile);
            refactor.add(copyFile);
            refactor.add(safeDeleteRefactor);
            
                migratePackages.add(jUnit4);
                migratePackages.add(createNewMigration);
                
            refactor.add(migratePackages);
            
            refactor.add(invertBoolean);
            refactor.add(internationalize);
            refactor.add(removeUnusedResources);
            refactor.add(migrateToAppCompat);
            refactor.add(migrateToAndroidX);
            refactor.add(migrateToNonTransitive);
            refactor.add(addRightToLeft);
            
        
        this.add(refactor);
        
            // We add them to build
                // We add them to flutter
                flutterBuild.add(buildAAR);
                flutterBuild.add(buildAPK);
                flutterBuild.add(buildAppBundle);
                flutterBuild.add(buildIOS);
                flutterBuild.add(buildWeb);
                
            // We add flutter
            build.add(flutterBuild);
            build.add(recompileMainDart);
            build.add(buildBundlesApk);
            build.add(analyseAPK);
            build.add(deployModuleToAppEngine);
            build.add(analyseBuildPerformance);
        
        this.add(build);
        
            // Nous ajoutons les jmenus et les jmenuitems one by one
            run.add(runMainDart);
            run.add(debugMainDart);
            run.add(runMainDartWithCoverage);
            run.add(runMainDart2);
            run.add(runRun);
            run.add(debugRun);
            run.add(profilRun);
            run.add(recordEspressoTest);
            run.add(attachToProcess);
            run.add(editConfigurationsRun);
            run.add(selectDevice);
            run.add(stopRun);
            run.add(flutterHotReload);
            run.add(flutterHotRestart);
            run.add(flutterHotReloadAllDevices);
            run.add(flutterHotRestartAllDevices);
            run.add(flutterRunMainDartInProfileMode);
            run.add(flutterRunMainDartInReleaseMode);
            run.add(flutterAttachRun);
            run.add(stopBackgroundProcesses);
            run.add(showRunningList);
            
                // We add the jmenuitems to the debuggin actions
                debuggingActions.add(stepOver);
                debuggingActions.add(forceStepOver);
                debuggingActions.add(stepInto);
                debuggingActions.add(forceStepInto);
                debuggingActions.add(smartStepInto);
                debuggingActions.add(stepOut);
                debuggingActions.add(runToCursor);
                debuggingActions.add(forceRunToCursor);
                debuggingActions.add(resetFrame);
                debuggingActions.add(forceReturn);
                debuggingActions.add(throwException);
                debuggingActions.add(resumeProgram);
                debuggingActions.add(evaluateExpression);
                debuggingActions.add(quickEvaluateExpression);
                debuggingActions.add(showExecutionPoint);
                debuggingActions.add(getThreadDump);
                
            run.add(debuggingActions);
            
                // We add the jmenuitems to the toogle breakpoint
                toogleBreakpoint.add(lineBreakpoint);
                toogleBreakpoint.add(methodBreakpoint);
                toogleBreakpoint.add(temporaryLineBreakpoint);
                toogleBreakpoint.add(toogleBreakpointEnabled);
                
            run.add(toogleBreakpoint);
            
            run.add(viewBreakpoints);
            run.add(testHistory);
            run.add(importTestFromFile);
            run.add(showCoverageData);
            run.add(attachDebuggerToAndroidProcess);
            
        this.add(run);
        
                taskEtContexts.add(switchTask);
                taskEtContexts.add(openTask);
                taskEtContexts.add(closeActiveTask);
                taskEtContexts.add(editDefaultTask);
                taskEtContexts.add(createChangelist);
                taskEtContexts.add(showDescription);
                taskEtContexts.add(openInBrowser);
                taskEtContexts.add(analyzeStackTraceFromTask);
                taskEtContexts.add(configureServers);
                taskEtContexts.add(saveContext);
                taskEtContexts.add(loadContext);
                taskEtContexts.add(clearContext);
            
            tools.add(taskEtContexts);
            
            tools.add(generateJavaDoc);
            tools.add(createCommandLineLaucher);
            tools.add(createDesktopEntry);
            
                xmlActions.add(generateDTDFromXMLFile);
                xmlActions.add(convertSchema);
                xmlActions.add(generateXSDSchemaFromXMLFile);
                xmlActions.add(generateXMLDocumentFromXSDSchema);
            
            tools.add(xmlActions);
            
                markdownConverter.add(importWordDocument);
                markdownConverter.add(exportMarkdownFileTo);
                markdownConverter.add(configurePandoc);
            
            tools.add(markdownConverter);
            
            tools.add(jShellConsole);
            
                clingTools.add(startNewClingSession);
                clingTools.add(sendIncludedHeadersToCling);
                clingTools.add(sendToCling);
               
            tools.add(clingTools);
            
                kotlinTools.add(configureKotlinPluginUPdates);
                kotlinTools.add(enableMigrationsDetection);
                kotlinTools.add(kotlinREPLExperimantal);
                kotlinTools.add(configureKotlinInProject);
                kotlinTools.add(configureKotlinJavaScriptInProject);
                kotlinTools.add(showKotlinBytecode);
                kotlinTools.add(decompileToJava);
                
            tools.add(kotlinTools);
            
            tools.add(deviceManagerTools);
            tools.add(sdkManager);
            tools.add(resourceManager);
            tools.add(troubleshootDeviceConnections);
            tools.add(androidSDKUpgradeAssistant);
            tools.add(firebaseTools);
            tools.add(appLinksAssistant);
            tools.add(layoutInspector);
            tools.add(agpUpgradeAssistant);
            
                flutterTools.add(gettingStarted);
                flutterTools.add(flutterUpgrade);
                flutterTools.add(flutterDoctor);
                flutterTools.add(flutterPubGet);
                flutterTools.add(flutterPubUpgrade);
                flutterTools.add(flutterClean);
                flutterTools.add(flutterClean);
                flutterTools.add(openFlutterDevTools);
                flutterTools.add(openForEditingInAndroidStudio);
                flutterTools.add(submitFeedback);
                
            tools.add(flutterTools);
            
        this.add(tools);

            
            vcs.add(enableVersionControlIntegration);
            vcs.add(vcsOperationsPopup);
            vcs.add(applyPatch);
            vcs.add(applyPatchFromClipboard);
            vcs.add(getProjectFromVersionControl);
            
                browseVCSRepository.add(showGitRepositoryLog);
                browseVCSRepository.add(browseSubversionRepository);
                
            vcs.add(browseVCSRepository);
            
            vcs.add(createMercurialRepository);
            vcs.add(createGitRepository);
            vcs.add(shareProjectOnGitHub);
            vcs.add(setupOnGoogleCloudSourceRepositories);
            vcs.add(importIntoSubversion);
            vcs.add(shareProjectSubverion);
            
        this.add(vcs);
        
            window.add(storeCurrentLayoutAsDefault);
            window.add(restoreDefaultLayout);
            
                storeLayout.add(defaultStoreLayout);
                storeLayout.add(newStoreLayout);
                
            window.add(storeLayout);
            
                restoreLayout.add(defaultRestoreLayout);
                
            window.add(restoreLayout);
            
            window.add(deleteLayout);
            
                activeToolWindow.add(hideActiveToolWindow);
                activeToolWindow.add(hideSideToolWindows);
                activeToolWindow.add(hideAllToolWindows);
                activeToolWindow.add(closeActiveTab);
                activeToolWindow.add(jumpToLastToolWindow);
                activeToolWindow.add(maximizeToolWindow);
                activeToolWindow.add(viewMode);
                activeToolWindow.add(moveTo);
                activeToolWindow.add(groupTabs);
                activeToolWindow.add(resize);
                
            window.add(activeToolWindow);
            
                editorTabs.add(selectNextTab);
                editorTabs.add(selectPreviousTab);
                editorTabs.add(pinTab);
                editorTabs.add(keepTabOpen);
                editorTabs.add(closeTab);
                editorTabs.add(closeOtherTabs);
                editorTabs.add(closeAllTabs);
                editorTabs.add(closeUnmodifiedTabs);
                editorTabs.add(closeAllButPinned);
                editorTabs.add(closeTabsToTheLeft);
                editorTabs.add(closeTabsToTheRight);
                editorTabs.add(closeAllReadOnly);
                editorTabs.add(reopenClosedTab);
                editorTabs.add(splitRight);
                editorTabs.add(splitDown);
                editorTabs.add(stretchEditorToTop);
                editorTabs.add(stretchEditorToLeft);
                editorTabs.add(stretchEditorToBottom);
                editorTabs.add(stretchEditorToRight);
                editorTabs.add(changeSplitterOrientation);
                editorTabs.add(maximizeEditorNormalizeSplits);
                editorTabs.add(unsplit);
                editorTabs.add(unsplitAll);
                editorTabs.add(gotoNextSplitter);
                editorTabs.add(gotoPreviousSplitter);
                editorTabs.add(configureEditorTabs);
                
            window.add(editorTabs);
            
                notifications.add(closeFirst);
                notifications.add(closeAll);
                
            window.add(notifications);
            
                backgroundTasks.add(showBackgroundTasks);
                backgroundTasks.add(autoShowBackgroundTasks);
                
             window.add(backgroundTasks);
             
             window.add(nextProjectWindow);
             window.add(previousProjectWindow);
            
        this.add(window);
        
            help.add(findAction);
            help.add(androidStudioHelp);
            help.add(flutterPluginHelp);
            help.add(intellijIdeaHelp);
            help.add(whatsNewInAndroidStudio);
            help.add(gettingStartedHelp);
            help.add(androidStudioOnYoutube);
            help.add(licencesHelp);
            help.add(keyBoardShortcutsPDF);
            help.add(tipOfTheDay);
            help.add(myProductivity);
            help.add(submitFeedbackHelp);
            help.add(showLogInVisualStudioCode);
            help.add(collectLogsAndDiagnosticData);
            help.add(analyzeMemoryUsage);
            help.add(deleteLeftOverIdeDirectories);
            
                diagnosticTools.add(activityMonitor);
                diagnosticTools.add(analyzePluginStartupPerformance);
                diagnosticTools.add(dumpThreads);
                diagnosticTools.add(debugLogSettings);
                diagnosticTools.add(ccppEnableEventTracing);
                diagnosticTools.add(executePerformanceScript);
                diagnosticTools.add(traceResourceUpdates);
                diagnosticTools.add(dumpResourceTrace);
                diagnosticTools.add(openIndexingDiagnostics);
            
            help.add(diagnosticTools);
            
            help.add(changeMemorySettings);
            help.add(editCustomProperties);
            help.add(editCustomVMOptions);
            help.add(checkForUpdates);
            help.add(aboutHelp);

            this.add(help);
    }
    
    // Getters and setters

    public Fenetre getFenetre() {
        return fenetre;
    }

    public void setFenetre(Fenetre fenetre) {
        this.fenetre = fenetre;
    }

}
