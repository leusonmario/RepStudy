/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 04 17:36:02 GMT 2021
 */

package org.opentripplanner.routing.spt;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MultiShortestPathTree_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.opentripplanner.routing.spt.MultiShortestPathTree"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/OpenTripPlanner/4c506dce43775704919d084f0acfba86d251bf4a/evosuite_5"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MultiShortestPathTree_ESTest_scaffolding.class.getClassLoader() ,
      "org.opentripplanner.routing.services.notes.StreetNotesService$2",
      "org.opentripplanner.routing.services.notes.StreetNotesService$1",
      "org.opentripplanner.routing.services.notes.StreetNotesService$4",
      "org.opentripplanner.routing.services.notes.StreetNotesService$3",
      "org.opentripplanner.routing.graph.Edge$ValidVertexTypes",
      "com.vividsolutions.jts.algorithm.CentroidLine",
      "com.google.common.collect.Collections2",
      "com.vividsolutions.jts.geom.PrecisionModel",
      "org.opentripplanner.routing.vertextype.TransitStop",
      "org.onebusaway.gtfs.model.calendar.CalendarServiceData",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "org.opentripplanner.common.geometry.PackedCoordinateSequence$Double",
      "org.opentripplanner.routing.services.notes.StreetNotesSource",
      "org.opentripplanner.common.geometry.PackedCoordinateSequence$Float",
      "org.opentripplanner.model.StopPattern",
      "org.opentripplanner.routing.services.StreetVertexIndexService",
      "org.opentripplanner.routing.core.State",
      "org.opentripplanner.routing.core.TraverseMode",
      "org.onebusaway.gtfs.model.FareAttribute",
      "org.onebusaway.gtfs.model.ServiceCalendarDate",
      "org.onebusaway.gtfs.model.FeedInfo",
      "org.opentripplanner.routing.trippattern.TripTimes",
      "com.google.common.collect.Maps$KeySet",
      "org.opentripplanner.routing.vertextype.TransitStopDepart",
      "org.opentripplanner.routing.graph.VertexComparatorFactory",
      "org.opentripplanner.routing.graph.Graph$LoadLevel",
      "org.opentripplanner.common.MavenVersion",
      "org.opentripplanner.api.parameter.QualifiedModeSetSequence",
      "com.vividsolutions.jts.algorithm.InteriorPointLine",
      "org.onebusaway.gtfs.model.Frequency",
      "org.opentripplanner.routing.spt.GraphPath",
      "org.onebusaway.gtfs.model.StopTimeProxy",
      "com.vividsolutions.jts.algorithm.CentroidPoint",
      "com.google.common.collect.SortedMapDifference",
      "org.opentripplanner.routing.vertextype.StreetVertex",
      "org.opentripplanner.routing.core.IntersectionTraversalCostModel",
      "org.opentripplanner.routing.edgetype.TablePatternEdge",
      "org.opentripplanner.api.resource.GraphMetadata",
      "org.opentripplanner.routing.vertextype.ElevatorOffboardVertex",
      "org.opentripplanner.routing.core.StateData",
      "org.onebusaway.gtfs.model.Stop",
      "org.onebusaway.gtfs.model.StopTime",
      "com.google.common.base.Predicate",
      "com.vividsolutions.jts.geom.GeometryFactory",
      "org.opentripplanner.routing.spt.MultiShortestPathTree",
      "org.opentripplanner.routing.vertextype.ElevatorOnboardVertex",
      "org.opentripplanner.updater.stoptime.TimetableSnapshotSource",
      "org.opentripplanner.updater.GraphUpdaterManager",
      "com.google.common.base.Joiner",
      "org.onebusaway.gtfs.model.ServiceCalendar",
      "org.opentripplanner.routing.core.StateEditor",
      "org.opentripplanner.routing.alertpatch.AlertPatch",
      "org.opentripplanner.routing.graph.Vertex$ValidEdgeTypes",
      "com.vividsolutions.jts.geom.Lineal",
      "com.vividsolutions.jts.algorithm.InteriorPointPoint",
      "org.opentripplanner.routing.util.IncrementingIdGenerator",
      "org.opentripplanner.routing.graph.Graph$GraphObjectInputStream",
      "org.opentripplanner.routing.vertextype.OnboardDepartVertex",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "org.opentripplanner.routing.algorithm.NegativeWeightException",
      "org.opentripplanner.analyst.core.SampleSource",
      "org.opentripplanner.routing.vertextype.TransitStopArrive",
      "org.opentripplanner.common.geometry.PackedCoordinateSequence",
      "com.google.common.collect.AbstractMapBasedMultimap$AsMap",
      "com.vividsolutions.jts.geom.Coordinate",
      "com.vividsolutions.jts.geom.Envelope",
      "org.opentripplanner.routing.graph.Vertex",
      "org.opentripplanner.routing.edgetype.StreetBikeRentalLink",
      "org.onebusaway.gtfs.model.IdentityBean",
      "com.google.common.base.Joiner$MapJoiner",
      "org.opentripplanner.routing.vertextype.IntersectionVertex",
      "org.opentripplanner.routing.vertextype.PatternDepartVertex",
      "org.opentripplanner.routing.core.TraverseModeSet",
      "org.onebusaway.gtfs.impl.GenericDaoImpl$EntityHandler",
      "com.google.common.collect.MapDifference",
      "org.onebusaway.gtfs.services.GenericMutableDao",
      "org.onebusaway.gtfs.model.AgencyAndId",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "org.opentripplanner.analyst.core.GeometryIndexService",
      "org.opentripplanner.routing.trippattern.Deduplicator",
      "org.opentripplanner.routing.vertextype.PatternArriveVertex",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.opentripplanner.routing.core.RoutingRequest",
      "org.opentripplanner.routing.edgetype.StreetTraversalPermission",
      "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "org.opentripplanner.common.TurnRestriction",
      "org.opentripplanner.routing.edgetype.StreetWithElevationEdge",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.AbstractMapBasedMultimap$KeySet",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedList",
      "org.opentripplanner.routing.core.ServiceDay",
      "com.google.common.collect.HashMultimap",
      "org.opentripplanner.routing.graph.Graph",
      "org.opentripplanner.common.geometry.DistanceLibrary",
      "org.opentripplanner.routing.vertextype.BikeRentalStationVertex",
      "org.opentripplanner.common.model.GenericLocation",
      "org.onebusaway.gtfs.services.GenericDao",
      "org.opentripplanner.routing.edgetype.ElevatorHopEdge",
      "com.vividsolutions.jts.geom.Geometry",
      "org.opentripplanner.routing.vertextype.TransitVertex",
      "com.google.common.base.Objects",
      "org.onebusaway.gtfs.model.Route",
      "org.opentripplanner.routing.edgetype.OnboardEdge",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Maps$9",
      "org.opentripplanner.routing.edgetype.PartialStreetEdge",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.Function",
      "org.opentripplanner.routing.core.RouteMatcher",
      "com.google.common.collect.ImmutableMap",
      "org.opentripplanner.routing.core.StopMatcher",
      "org.opentripplanner.routing.core.TransferTable",
      "org.opentripplanner.routing.services.notes.StreetNotesService",
      "org.opentripplanner.analyst.request.SampleFactory",
      "org.onebusaway.gtfs.services.GtfsMutableDao",
      "org.onebusaway.gtfs.services.GtfsRelationalDao",
      "org.onebusaway.gtfs.services.calendar.CalendarService",
      "org.opentripplanner.routing.edgetype.TripPattern",
      "org.onebusaway.csv_entities.exceptions.CsvException",
      "org.onebusaway.gtfs.impl.GtfsRelationalDaoImpl",
      "org.opentripplanner.routing.edgetype.FreeEdge",
      "org.opentripplanner.routing.bike_rental.BikeRentalStation",
      "org.opentripplanner.routing.core.SimpleIntersectionTraversalCostModel",
      "org.opentripplanner.routing.spt.AbstractShortestPathTree",
      "org.onebusaway.gtfs.model.Agency",
      "com.vividsolutions.jts.geom.CoordinateSequence",
      "org.opentripplanner.routing.spt.ShortestPathTree",
      "org.onebusaway.gtfs.services.GtfsDao",
      "org.opentripplanner.routing.core.TraverseModeSet$1",
      "org.opentripplanner.routing.services.StreetVertexIndexFactory",
      "org.onebusaway.gtfs.services.GtfsMutableRelationalDao",
      "com.vividsolutions.jts.geom.util.GeometryMapper$MapOp",
      "org.opentripplanner.routing.vertextype.TransitStationStop",
      "org.opentripplanner.routing.vertextype.ExitVertex",
      "org.opentripplanner.routing.edgetype.ElevatorEdge",
      "org.onebusaway.gtfs.impl.MultipleCalendarsForServiceIdException",
      "com.google.common.collect.Multiset",
      "org.opentripplanner.routing.services.notes.StaticStreetNotesSource",
      "com.google.common.collect.AbstractMultimap",
      "org.opentripplanner.routing.vertextype.OffboardVertex",
      "org.opentripplanner.routing.edgetype.SimpleEdge",
      "com.google.common.collect.Multimap",
      "org.opentripplanner.routing.edgetype.StreetEdge",
      "org.opentripplanner.graph_builder.annotation.NoFutureDates",
      "com.vividsolutions.jts.geom.LineString",
      "org.onebusaway.csv_entities.exceptions.CsvEntityException",
      "org.opentripplanner.routing.graph.GraphIndex",
      "com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap",
      "org.opentripplanner.graph_builder.annotation.StopUnlinked",
      "com.vividsolutions.jts.geom.GeometryComponentFilter",
      "com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet",
      "org.opentripplanner.graph_builder.annotation.GraphBuilderAnnotation",
      "org.opentripplanner.routing.edgetype.TransitBoardAlight",
      "com.vividsolutions.jts.geom.GeometryCollection",
      "org.opentripplanner.routing.core.AbstractIntersectionTraversalCostModel",
      "org.opentripplanner.analyst.core.GeometryIndex",
      "org.onebusaway.gtfs.model.FareRule",
      "org.opentripplanner.routing.core.MortonVertexComparatorFactory",
      "org.opentripplanner.routing.vertextype.PatternStopVertex",
      "org.onebusaway.gtfs.impl.GenericDaoImpl",
      "org.opentripplanner.routing.vertextype.TransitStopStreetVertex",
      "org.opentripplanner.model.GraphBundle",
      "org.onebusaway.gtfs.impl.GtfsDaoImpl",
      "org.opentripplanner.routing.edgetype.PatternEdge",
      "org.onebusaway.gtfs.model.Transfer",
      "com.google.common.collect.Maps",
      "org.onebusaway.gtfs.model.Trip",
      "com.google.common.collect.SetMultimap",
      "org.opentripplanner.routing.vertextype.OnboardVertex",
      "org.onebusaway.csv_entities.exceptions.EntityInstantiationException",
      "org.onebusaway.gtfs.model.ShapePoint",
      "org.opentripplanner.common.model.NamedPlace",
      "org.opentripplanner.routing.services.notes.NoteMatcher",
      "com.google.common.collect.Maps$EntryTransformer",
      "org.opentripplanner.routing.core.RoutingContext",
      "org.opentripplanner.routing.core.OptimizeType",
      "org.onebusaway.gtfs.model.Pathway",
      "org.opentripplanner.routing.util.UniqueIdGenerator",
      "org.opentripplanner.routing.graph.Edge"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MultiShortestPathTree_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.opentripplanner.routing.spt.AbstractShortestPathTree",
      "org.opentripplanner.common.MavenVersion",
      "org.opentripplanner.routing.spt.MultiShortestPathTree",
      "org.onebusaway.csv_entities.schema.annotations.CsvFieldNameConvention",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion",
      "com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing",
      "org.opentripplanner.routing.graph.Graph",
      "org.opentripplanner.routing.core.TraverseModeSet",
      "org.opentripplanner.routing.core.TraverseModeSet$1",
      "org.opentripplanner.routing.core.RoutingRequest",
      "org.opentripplanner.routing.core.AbstractIntersectionTraversalCostModel",
      "org.opentripplanner.routing.core.SimpleIntersectionTraversalCostModel",
      "org.opentripplanner.routing.core.RouteMatcher",
      "org.opentripplanner.routing.core.StopMatcher",
      "org.opentripplanner.common.model.GenericLocation",
      "org.opentripplanner.routing.impl.StreetVertexIndexServiceImpl",
      "org.opentripplanner.common.geometry.SphericalDistanceLibrary",
      "org.opentripplanner.common.geometry.HashGridSpatialIndex",
      "gnu.trove.impl.hash.THash",
      "gnu.trove.impl.hash.TPrimitiveHash",
      "gnu.trove.impl.hash.TLongHash",
      "gnu.trove.map.hash.TLongObjectHashMap",
      "gnu.trove.impl.HashFunctions",
      "gnu.trove.impl.PrimeFinder",
      "gnu.trove.impl.Constants",
      "gnu.trove.map.hash.TLongObjectHashMap$1",
      "org.opentripplanner.api.parameter.QualifiedModeSetSequence",
      "com.google.common.collect.Lists",
      "com.beust.jcommander.internal.Sets",
      "org.opentripplanner.api.parameter.QualifiedMode",
      "org.opentripplanner.routing.impl.DefaultStreetVertexIndexFactory",
      "org.opentripplanner.routing.core.RoutingRequest$1",
      "org.opentripplanner.routing.graph.Vertex$ValidEdgeTypes",
      "org.opentripplanner.routing.graph.Vertex",
      "org.opentripplanner.routing.vertextype.OnboardDepartVertex",
      "org.opentripplanner.routing.services.notes.StreetNotesService$1",
      "org.opentripplanner.routing.services.notes.StreetNotesService$2",
      "org.opentripplanner.routing.services.notes.StreetNotesService$3",
      "org.opentripplanner.routing.services.notes.StreetNotesService$4",
      "org.opentripplanner.routing.services.notes.StreetNotesService",
      "org.opentripplanner.routing.services.notes.StaticStreetNotesSource",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.HashMultimap",
      "com.google.common.base.Preconditions",
      "org.opentripplanner.routing.core.TransferTable",
      "org.opentripplanner.routing.trippattern.Deduplicator",
      "com.google.common.base.Joiner",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "org.opentripplanner.routing.core.MortonVertexComparatorFactory",
      "org.onebusaway.gtfs.model.IdentityBean",
      "org.onebusaway.gtfs.model.Route",
      "org.opentripplanner.common.geometry.PackedCoordinateSequence",
      "org.opentripplanner.common.geometry.PackedCoordinateSequence$Double",
      "org.opentripplanner.routing.util.IncrementingIdGenerator",
      "org.opentripplanner.routing.graph.Edge$ValidVertexTypes",
      "org.opentripplanner.routing.graph.Edge",
      "org.opentripplanner.routing.edgetype.StreetBikeRentalLink",
      "org.opentripplanner.gtfs.GtfsLibrary",
      "org.onebusaway.gtfs.model.Stop",
      "org.opentripplanner.routing.vertextype.TransitVertex",
      "org.opentripplanner.routing.vertextype.OffboardVertex",
      "org.opentripplanner.routing.vertextype.TransitStationStop",
      "org.opentripplanner.routing.vertextype.TransitStop",
      "com.vividsolutions.jts.geom.Coordinate",
      "org.opentripplanner.routing.vertextype.StreetVertex",
      "org.opentripplanner.routing.location.StreetLocation",
      "org.opentripplanner.routing.edgetype.StreetEdge",
      "org.opentripplanner.routing.edgetype.TablePatternEdge",
      "org.opentripplanner.routing.edgetype.TransitBoardAlight",
      "org.opentripplanner.routing.graph.Graph$GraphObjectInputStream",
      "org.opentripplanner.routing.core.TraversalRequirements",
      "org.opentripplanner.routing.bike_rental.BikeRentalStation",
      "org.opentripplanner.routing.vertextype.BikeRentalStationVertex",
      "org.opentripplanner.routing.vertextype.ElevatorOnboardVertex",
      "org.opentripplanner.routing.vertextype.IntersectionVertex",
      "org.opentripplanner.routing.edgetype.PathwayEdge",
      "org.onebusaway.gtfs.impl.GenericDaoImpl",
      "org.onebusaway.gtfs.impl.GtfsDaoImpl",
      "org.onebusaway.gtfs.impl.GtfsRelationalDaoImpl",
      "org.onebusaway.gtfs.impl.StopTimeArray",
      "org.onebusaway.gtfs.impl.ShapePointArray",
      "org.opentripplanner.routing.vertextype.OnboardVertex",
      "org.opentripplanner.routing.vertextype.PatternStopVertex",
      "org.opentripplanner.routing.vertextype.PatternArriveVertex",
      "org.opentripplanner.routing.edgetype.TimedTransferEdge",
      "org.opentripplanner.routing.vertextype.TransitStopStreetVertex",
      "org.opentripplanner.routing.edgetype.ElevatorBoardEdge",
      "org.opentripplanner.common.geometry.Serializable2DPackedCoordinateSequenceFactory",
      "com.vividsolutions.jts.geom.GeometryFactory",
      "com.vividsolutions.jts.geom.PrecisionModel$Type",
      "com.vividsolutions.jts.geom.PrecisionModel",
      "org.opentripplanner.common.geometry.GeometryUtils",
      "com.vividsolutions.jts.geom.Geometry$1",
      "com.vividsolutions.jts.geom.Geometry",
      "com.vividsolutions.jts.geom.LineString",
      "org.opentripplanner.routing.core.State",
      "org.opentripplanner.model.StopPattern",
      "org.opentripplanner.routing.edgetype.TripPattern",
      "org.opentripplanner.routing.edgetype.Timetable",
      "com.beust.jcommander.internal.Lists",
      "org.opentripplanner.routing.vertextype.ElevatorOffboardVertex",
      "org.opentripplanner.routing.edgetype.StreetTransitLink",
      "org.opentripplanner.routing.core.StateData",
      "org.opentripplanner.routing.vertextype.ParkAndRideVertex",
      "org.opentripplanner.routing.edgetype.ParkAndRideLinkEdge",
      "org.apache.commons.math3.util.FastMath",
      "org.opentripplanner.routing.edgetype.PatternInterlineDwell",
      "org.opentripplanner.routing.edgetype.FreeEdge",
      "org.opentripplanner.routing.edgetype.SimpleEdge",
      "org.opentripplanner.routing.core.StateEditor",
      "org.opentripplanner.graph_builder.annotation.GraphBuilderAnnotation",
      "org.opentripplanner.graph_builder.annotation.StopUnlinked",
      "org.onebusaway.gtfs.model.Transfer",
      "org.opentripplanner.routing.vertextype.TransitStation",
      "org.opentripplanner.routing.edgetype.ParkAndRideEdge",
      "com.vividsolutions.jts.geom.GeometryCollection",
      "com.vividsolutions.jts.geom.MultiPolygon",
      "com.vividsolutions.jts.geom.impl.CoordinateArraySequenceFactory",
      "org.opentripplanner.routing.vertextype.ExitVertex",
      "org.opentripplanner.common.geometry.PackedCoordinateSequence$Float",
      "org.onebusaway.gtfs.model.Trip",
      "org.onebusaway.gtfs.impl.GtfsRelationalDaoImpl$SimplePropertyQuery",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalDateTime",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.DurationField",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.DateTimeZone",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.IllegalFieldValueException",
      "com.vividsolutions.jts.geom.impl.PackedCoordinateSequence",
      "com.vividsolutions.jts.geom.impl.PackedCoordinateSequence$Float",
      "com.vividsolutions.jts.geom.Envelope",
      "org.opentripplanner.common.geometry.HashGridSpatialIndex$4",
      "com.vividsolutions.jts.geom.impl.PackedCoordinateSequence$Double",
      "org.opentripplanner.common.geometry.DirectionUtils",
      "org.onebusaway.gtfs.model.Pathway",
      "org.opentripplanner.routing.edgetype.ElevatorAlightEdge",
      "org.opentripplanner.routing.impl.DefaultRemainingWeightHeuristicFactoryImpl",
      "org.opentripplanner.routing.core.RoutingContext",
      "org.opentripplanner.api.resource.DebugOutput",
      "org.onebusaway.gtfs.model.calendar.ServiceDate",
      "com.vividsolutions.jts.operation.distance.DistanceOp",
      "com.vividsolutions.jts.algorithm.PointLocator",
      "com.vividsolutions.jts.algorithm.BoundaryNodeRule$Mod2BoundaryNodeRule",
      "com.vividsolutions.jts.algorithm.BoundaryNodeRule$EndPointBoundaryNodeRule",
      "com.vividsolutions.jts.algorithm.BoundaryNodeRule$MultiValentEndPointBoundaryNodeRule",
      "com.vividsolutions.jts.algorithm.BoundaryNodeRule$MonoValentEndPointBoundaryNodeRule",
      "com.vividsolutions.jts.algorithm.BoundaryNodeRule",
      "com.vividsolutions.jts.index.strtree.AbstractSTRtree",
      "com.vividsolutions.jts.index.strtree.STRtree$1",
      "com.vividsolutions.jts.index.strtree.STRtree$2",
      "com.vividsolutions.jts.index.strtree.STRtree$3",
      "com.vividsolutions.jts.index.strtree.STRtree",
      "com.vividsolutions.jts.util.Assert",
      "com.vividsolutions.jts.index.strtree.AbstractNode",
      "com.vividsolutions.jts.index.strtree.STRtree$STRtreeNode",
      "org.opentripplanner.routing.vertextype.PatternDepartVertex",
      "org.opentripplanner.updater.stoptime.TimetableSnapshotSource",
      "org.opentripplanner.routing.edgetype.TimetableResolver",
      "org.opentripplanner.routing.edgetype.AreaEdgeList",
      "org.opentripplanner.routing.edgetype.StreetWithElevationEdge",
      "org.opentripplanner.routing.edgetype.AreaEdge",
      "org.opentripplanner.util.BitSetUtils",
      "org.opentripplanner.common.geometry.CompactLineString",
      "org.opentripplanner.routing.edgetype.PartialStreetEdge",
      "org.onebusaway.gtfs.model.AgencyAndId",
      "org.opentripplanner.routing.edgetype.RentABikeAbstractEdge",
      "org.opentripplanner.routing.edgetype.RentABikeOnEdge",
      "org.opentripplanner.util.DateUtils",
      "org.opentripplanner.util.DateConstants",
      "org.onebusaway.gtfs.model.calendar.CalendarServiceData",
      "org.opentripplanner.routing.edgetype.ElevatorHopEdge",
      "org.opentripplanner.analyst.request.SampleFactory",
      "org.opentripplanner.analyst.core.GeometryIndex",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.Iterables$7",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.base.Predicates",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.AbstractIterator$1",
      "org.opentripplanner.common.model.NamedPlace",
      "org.onebusaway.gtfs.model.StopTime",
      "com.vividsolutions.jts.geom.impl.CoordinateArraySequence",
      "com.vividsolutions.jts.geom.CoordinateSequences",
      "org.joda.time.tz.UTCProvider",
      "org.opentripplanner.routing.edgetype.TransferEdge",
      "org.opentripplanner.graph_builder.annotation.NonStationParentStation",
      "org.opentripplanner.routing.error.GraphNotFoundException",
      "org.opentripplanner.routing.edgetype.RentABikeOffEdge",
      "org.opentripplanner.model.GraphBundle",
      "org.opentripplanner.graph_builder.annotation.StopNotLinkedForTransfers",
      "com.vividsolutions.jts.geom.LinearRing",
      "org.opentripplanner.routing.algorithm.strategies.DefaultRemainingWeightHeuristic",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.Instant",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.DateMidnight",
      "org.opentripplanner.routing.vertextype.TransitStopDepart",
      "com.vividsolutions.jts.geom.Polygon",
      "org.opentripplanner.routing.edgetype.LegSwitchingEdge",
      "org.opentripplanner.routing.request.BannedStopSet",
      "org.opentripplanner.routing.alertpatch.AlertPatch",
      "org.opentripplanner.routing.edgetype.PatternHop",
      "com.vividsolutions.jts.geom.DefaultCoordinateSequenceFactory",
      "com.vividsolutions.jts.geom.DefaultCoordinateSequence",
      "org.opentripplanner.routing.impl.CandidateEdgeBundle",
      "com.google.common.collect.Iterables$2",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.Iterators$5",
      "org.opentripplanner.routing.core.ConstantIntersectionTraversalCostModel",
      "org.opentripplanner.routing.trippattern.TripTimes",
      "org.onebusaway.gtfs.model.Frequency",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeParserBucket",
      "org.opentripplanner.updater.GraphUpdaterManager",
      "com.google.common.util.concurrent.ThreadFactoryBuilder",
      "com.google.common.util.concurrent.ThreadFactoryBuilder$1",
      "com.google.common.collect.LinkedListMultimap",
      "org.onebusaway.gtfs.model.FareRule",
      "org.opentripplanner.common.model.T2",
      "com.google.common.base.Objects"
    );
  }
}
