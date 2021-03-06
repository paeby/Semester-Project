package alns.param;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.tuple.ImmutablePair;

/**
 * Holds all fixed parameters of the algorithm.
 *
 * @author Markov
 * @version 1.0
 */
public class Parameters {

    ///////////////////////////////////////////////////////////////
    // DATABASE PARAMETERS
    ///////////////////////////////////////////////////////////////
    // DB user
    public static final String dbUser = "postgres";
    // DB password
    public static final String dbPassword = "kopele";
    // DB name
    public static final String dbName = "EcoWaste_anonymized_March2016";
    // DB table names
    public static final String tableContainers = "container";
    public static final String tableContainerTypes = "containertype";
    public static final String tableEcopoints = "ecopoint";
    public static final String tableDumps = "dump";
    public static final String tableStartingPoints = "startingpoint";
    public static final String tableTrucks = "truck";
    public static final String tableFlowTypes = "flowtype";
    public static final String tableDistances = "distance";
    public static final String tableTourContainers = "tourcontainer";
    public static final String tableTours = "tour";
    public static final String tableCollections = "collection";

    ///////////////////////////////////////////////////////////////
    // POINT PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static final short pointIsSP = 1;
    public static final short pointIsDump = 2;
    public static final short pointIsContainer = 3;
    public static final double serviceDurSP = 0.d;
    public static double flowSpecWeightCF = 1000.d;

    ///////////////////////////////////////////////////////////////
    // TOUR PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static final double tourStartTime = 8.d;
    public static final double tourEndTime = 12.d;
    public static final double tourMaxDur = 4.d;

    ///////////////////////////////////////////////////////////////
    // OTHER PROBLEM SPECIFIC PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static final double overflowCost = 100.d;
    public static final double hEmergencyCost = 100.d;
    public static final double hRouteFailureCostMultiplier = 1.d;

    ///////////////////////////////////////////////////////////////
    // DEFAULT VALUES
    ///////////////////////////////////////////////////////////////
    public static final int _404 = -404;
    public static final String emptyString = "_empty";
    public static final int defaultRunNb = 0;
    public static final char defaultTestValueID = 'a';

    ///////////////////////////////////////////////////////////////
    // PATHS
    ///////////////////////////////////////////////////////////////
//    public static final String forecastRFile = "D:/EPFL/WP5 IRP/Heuristic/PrepRealData/main.R";
//    public static final String dataObjectFolder = "D:\\EPFL\\WP5 IRP\\Instances\\Real data\\Instances\\";
//    public static final String instanceFolder = "D:\\EPFL\\WP5 IRP\\Instances\\Real data\\Instances\\";
//    public static final String estimatedInstanceFolder = "D:\\EPFL\\WP5 IRP\\Instances\\Real data\\Estimated instances\\";
//    public static final String reportedInstanceFolder = "D:\\EPFL\\WP5 IRP\\Instances\\Real data\\Reported Instances\\";
//    public static final String plotExportFolder = "D:\\www\\TOURPLOT\\output\\";
//    public static final String csvExportFolder = "D:\\EPFL\\WP5 IRP\\Heuristic\\CSV\\";

//    public static final String forecastRFile = "/home/markov/ALNSR/PrepRealData/rolling.R";
//    public static final String dataObjectFolder = "/data/markov/instances/";
//    public static final String instanceFolder = "/data/markov/instances/";
//    public static final String estimatedInstanceFolder = "/data/markov/estimated_instances/";
//    public static final String reportedInstanceFolder = "/data/markov/reported_instances/";
//    public static final String plotExportFolder = "/data/markov/plot_out/";
//    public static final String csvExportFolder = "/data/markov/csv_out/";
    
    public static final String forecastRFile = "​/data/students/paeby/forecast.R";
    public static final String dataObjectFolder = "/data/students/paeby/RealData/Forecast/";
    public static final String instanceFolder = "/data/students/paeby/RealData/Forecast/";
    public static final String estimatedInstanceFolder = "/data/students/paeby/RealData/Forecast/";
    public static final String reportedInstanceFolder = "/data/students/paeby/RealData/Forecast/";
    public static final String plotExportFolder = "/data/students/paeby/OutFiles/plot/";
    public static final String csvExportFolder = "/data/students/paeby/OutFiles/csv/";
    

//    public static final String forecastRFile = "​../Forecaset/forecast.R";
//    public static final String dataObjectFolder = "RealData/Forecast_5/";
//    public static final String instanceFolder = "RealData/Forecast_5/";
//    public static final String estimatedInstanceFolder = "RealData/Forecast_5/";
//    public static final String reportedInstanceFolder = "RealData/Forecast_5/";
//    public static final String plotExportFolder = "OutFiles/plot/";
//    public static final String csvExportFolder = "OutFiles/csv/";
    
    //To skip the autogenerated file ".DS_Store" generated by OSX
    public static final FilenameFilter filter = new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            return !name.equals(".DS_Store");
        }
    };
    
    ///////////////////////////////////////////////////////////////
    // BENCHMARK INSTANCE TYPES
    ///////////////////////////////////////////////////////////////
    public static final int benchmarkTypeCrevier2007 = 0;
    public static final int benchmarkTypeArchetti2007 = 1;
    public static final int benchmarkTypeArchetti2012 = 2;
    public static final int benchmarkTypeTaillard1999 = 3;
    public static final int benchmarkTypeCoelho2012b = 4;

    ///////////////////////////////////////////////////////////////
    // HEURISTICS FIXED PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static final long hRandSeed = 1;
    public static final int hStatsCollectionRate = 2000; // collection every x iteration
    public static boolean hPrintIterations = true;
    public static final short hPrintFreq = 5000;
    public static final short hSAALNSA = 0;
    public static final short hSAALNSB = 1;
    public static final short hModeTSP = 0;
    public static final short hModeVRP = 1;
    public static final short hModeVRPC = 2;
    public static final short hModeVRPT = 3;
    public static final short hModeIRP = 4;
    public static final short hModeIRPA = 5;
    public static final short hModeIRPC = 6;
    public static final short hStateNoOverflow = 0;
    public static final short hStateOverflow = 1;
    public static final String[] hTspDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "remShawCont", "empty1Day", "removeConsecVisits"};
    public static final String[] hVrpDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "remShawCont", "empty1Truck", "remRandDump", "remWorstDump"};
    public static final String[] hVrpcDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "remShawCont", "empty1Truck", "remRandDump", "remWorstDump", "swapAssgCont", "insRandDump", "insBestDump", "swapAssgDumps", "replRandDump", "reorderDumps"};
    public static final String[] hVrptDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "remShawCont", "empty1Truck", "swapAssgCont"};
    public static final String[] hIrpDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "empty1Day", "empty1Truck", "remRandDump", "remWorstDump", "removeConsecVisits", "removeAllShawContainersRelatedness", "removeCluster"};
    public static final String[] hIrpaDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "remShawCont", "empty1Day", "removeConsecVisits"};
    public static final String[] hIrpcDestroyOps = new String[]{"remRandRhoCont", "remWorstRhoCont", "remShawCont", "empty1Day", "removeConsecVisits"};
    public static final String[] hTspRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont", "swapAssgCont"};
    public static final String[] hVrpRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont", "swapAssgCont", "insRandDump", "insBestDump", "swapAssgDumps", "replRandDump", "reorderDumps", "replStartingPoint"};
    public static final String[] hVrpcRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont"};
    public static final String[] hVrptRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont"};
    public static final String[] hIrpRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont", "swapAssgCont", "insRandDump", "insBestDump", "swapAssgDumps", "replRandDump", "reorderDumps", "replStartingPoint", "insertRhoContainersWithRegret"};
    public static final String[] hIrpaRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont", "swapAssgCont"};
    public static final String[] hIrpcRepairOps = new String[]{"insRandRhoCont", "insBestRhoCont", "insShawCont", "swapAssgCont"};
    public static final int[] hNumDestroyOp = new int[]{Parameters.hTspDestroyOps.length, Parameters.hVrpDestroyOps.length, Parameters.hVrpcDestroyOps.length, Parameters.hVrptDestroyOps.length, Parameters.hIrpDestroyOps.length, Parameters.hIrpaDestroyOps.length, Parameters.hIrpcDestroyOps.length};
    public static final int[] hNumRepairOp = new int[]{Parameters.hTspRepairOps.length, Parameters.hVrpRepairOps.length, Parameters.hVrpcRepairOps.length, Parameters.hVrptRepairOps.length, Parameters.hIrpRepairOps.length, Parameters.hIrpaRepairOps.length, Parameters.hIrpcRepairOps.length};
    public static final double hMaxPenalty = 1E20;
    public static final double hMinPenalty = 1E-5;
    public static final double hMinWeight = 0.01;
    public static final int hMaxHorizon = 14;
    public static final int hMaxIterNoFeasible = 100000;

    ///////////////////////////////////////////////////////////////
    // HEURISTICS TUNABLE PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static double hInitTemp = 10000.d;
    public static double hFinTemp = 0.01d;
    public static double hStartTempControlParam = 0.6;
    public static double hCoolRate = 0.99998d;
    public static int hPhiSegmentLength = 2000;
    public static double hReactionFactor = 0.5d;
    // Change normalization factors for heuristics
    public static ArrayList<ImmutablePair<Integer, Double>> hDestroyOpNormFactorResets = new ArrayList<>(Arrays.asList(
            new ImmutablePair<>(7, 8d), new ImmutablePair<>(8, 8d)));
    public static ArrayList<ImmutablePair<Integer, Double>> hRepairOpNormFactorResets = new ArrayList<>(Arrays.asList(
            new ImmutablePair<>(1, 4.5d), new ImmutablePair<>(10,4.5d)));
    public static double hAwardS1 = 30.d;
    public static double hAwardS2 = 20.d;
    public static double hAwardS3 = 5.d;
    public static double hInitPenalty = 1.d;
    public static double hPenaltyRate = 1.06d;

    ///////////////////////////////////////////////////////////////
    // EXPERIMENT PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static int expNumberRuns = 10;
    public static int expNumberSimulationScenarios = 10000;
    public static double[] expSimululationPercentiles = new double[]{75.d, 90.d, 95.d, 99.d};
    public static Boolean expLocalSearchActivated = true;
    public static Boolean expCollectStats_default = false;
    public static Boolean expCollectSolutionImprovements_default = false;
    public static Boolean expUseHemmelmayrDPOperator = true;
    public static Boolean expDo2optLocalSearch = true;
    public static Boolean exp2optFirstImprovement = false; // if false: best improvement is used
    
    ///////////////////////////////////////////////////////////////
    // POLICY PARAMETERS
    ///////////////////////////////////////////////////////////////
    public static double policyContainerEffectiveVolumeFraction = 1.d;
    public static double policyTruckEffectiveVolumeFraction = 1.d;
    public static double policyTruckEffectiveWeightFraction = 1.d;    
}
