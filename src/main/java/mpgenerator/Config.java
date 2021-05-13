package mpgenerator;

/**
 * @author Erwin Feng
 * @since 2019-04-17 12:04
 */
public class Config {

    /** 包名：controller */
    public static final String PACKAGE_NAME_CONTROLLER = "controller";

    /** 包名：service */
    public static final String PACKAGE_NAME_REPOSITORY = "repository";

    /** 包名：service.impl */
    public static final String PACKAGE_NAME_REPOSITORY_IMPL = "repository.impl";

    /** 包名：model */
    public static final String PACKAGE_NAME_MODEL = "entity";

    /** 包名：mapper */
    public static final String PACKAGE_NAME_MAPPER = "mapper";

    /** 目录名：xml */
    public static final String DIR_NAME_XML = "mapper";

    /** 文件名后缀：Model */
    public static final String FILE_NAME_MODEL = "%sEntity";

    /** 文件名后缀：Mapper */
    public static final String FILE_NAME_MAPPER = "%sMapper";

    /** 文件名后缀：Mapper xml*/
    public static final String FILE_NAME_XML = "%sMapper";

    /** MP开头，Service结尾 */
    public static final String FILE_NAME_SERVICE = "%sRepository";

    /** 文件名后缀：ServiceImpl */
    public static final String FILE_NAME_SERVICE_IMPL = "%sRepositoryImpl";

    /** 文件名后缀：Controller */
    public static final String FILE_NAME_CONTROLLER = "%sController";

    /** 逻辑删除字段 */
    public static final String FIELD_LOGIC_DELETE_NAME = "delete_status";

    /** 乐观锁字段名 */
    public static final String FIELD_VERSION_NAME = "version";

    /** 作者 */
    public static final String AUTHOR = "Ajay Hao";

    /** 生成文件的工程目录 */
    public static String PROJECT_PATH = System.getProperty("user.dir");

    /** src输出目录 */
    public static final String OUTPUT_DIR = PROJECT_PATH + "/src/main/java";

    /** resource目录 */
    public static final String RESOURCE_OUTPUT_DIR = PROJECT_PATH + "/src/main/resources/mapper";

    /** 模板引擎。velocity / freemarker / beetl */
    public static final String TEMPLATE_ENGINE = "velocity";

    /** 是否支持Swagger，默认不支持 */
    public static final Boolean SWAGGER_SUPPORT = false;

}
